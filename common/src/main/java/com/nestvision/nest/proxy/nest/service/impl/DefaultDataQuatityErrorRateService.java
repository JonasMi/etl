package com.nestvision.nest.proxy.nest.service.impl;



import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.nest.api.request.RateStatisticsRequest;
import com.nestvision.nest.proxy.nest.api.request.RateStatisticsRequest.StatisticsType;
import com.nestvision.nest.proxy.nest.api.response.ErrorDetailPeriodTime;
import com.nestvision.nest.proxy.nest.api.response.RateStatisticResponse;
import com.nestvision.nest.proxy.nest.api.response.SolveDegreePeriodTime;
import com.nestvision.nest.proxy.nest.api.response.SolveDegreeWrapperResponse;
import com.nestvision.nest.proxy.nest.dao.DataQuatityErrorRateRepository;
import com.nestvision.nest.proxy.nest.dao.SolveDegreeRepository;
import com.nestvision.nest.proxy.nest.entity.DataQualityErrorRate;
import com.nestvision.nest.proxy.nest.entity.SolveDegree;
import com.nestvision.nest.proxy.nest.entity.SolveDegree.SolveType;
import com.nestvision.nest.proxy.nest.service.DataErrorMsgService;
import com.nestvision.nest.proxy.nest.service.DataQuatityErrorRateService;

/*@Service*/
public class DefaultDataQuatityErrorRateService extends AbstractBaseService<DataQualityErrorRate, String>
		implements DataQuatityErrorRateService {
	@Autowired
	private DataQuatityErrorRateRepository dataQualityErrorRateReposity;
	
	@Autowired
	private DataErrorMsgService dataErrorMsgService;
	
	@Autowired
	private SolveDegreeRepository solveDegreeRepository;
	
	@Override
	protected BaseRepository<DataQualityErrorRate, String> getBaseRepository() {
		return dataQualityErrorRateReposity;
	}
	
	@Override
	public List<SolveDegreeWrapperResponse> solveDegreeStatistic(RateStatisticsRequest rateStatisticsRequest) {
		Sort sort = new Sort(Direction.ASC, "time");
		Pageable pageable = new PageRequest(0, 1000000, sort);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<SolveDegreeWrapperResponse> solveDegreeWrapperResponses = new ArrayList<>();
		Date currentTime = new Date();
		try {
			currentTime = sdf.parse(sdf.format(rateStatisticsRequest.getEndTime()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		List<SolveDegree> hospitalList = dataErrorMsgService.getSolveDegreeHospitals(rateStatisticsRequest.getUpHospital());
		if(rateStatisticsRequest.getStatisticsType().equals(StatisticsType.last30days)){
			Calendar calendarStart = Calendar.getInstance();
			calendarStart.setTime(currentTime);
			calendarStart.add(Calendar.DAY_OF_MONTH, -29);
			List<SolveDegree> solveDegrees = solveDegreeRepository.findByTimeLessThanEqualAndTimeGreaterThanEqualAndSolveType(currentTime, calendarStart.getTime(), SolveType.day, pageable);
			for(SolveDegree dataQualityErrorRate:hospitalList){
				SolveDegreeWrapperResponse solveDegreeWrapperResponse = new SolveDegreeWrapperResponse();
				solveDegreeWrapperResponse.setUpHospital(dataQualityErrorRate.getUpHospital());
				solveDegreeWrapperResponse.setUpHospitalName(dataQualityErrorRate.getUpHospitalName());	
				List<SolveDegreePeriodTime> solveDegreePeriodTimes = new ArrayList<>();
				for(SolveDegree solveDegree:solveDegrees){
					if(solveDegree.getUpHospital().equals(dataQualityErrorRate.getUpHospital())){
						SolveDegreePeriodTime solveDegreePeriodTime = new SolveDegreePeriodTime();
						solveDegreePeriodTime.setErrorCount(solveDegree.getErrorCount());
						solveDegreePeriodTime.setSolveCount(solveDegree.getSolveCount());
						solveDegreePeriodTime.setSolveRate(solveDegree.getSolveRate());
						solveDegreePeriodTime.setTime(solveDegree.getTime());
						solveDegreePeriodTimes.add(solveDegreePeriodTime);
					}
				}
				solveDegreeWrapperResponse.setSolveDegreePeriodTimes(daySolveDegreeTimesFormat(solveDegreePeriodTimes,currentTime));
				solveDegreeWrapperResponses.add(solveDegreeWrapperResponse);
			}
		}
		if(rateStatisticsRequest.getStatisticsType().equals(StatisticsType.last13week)){
			for(SolveDegree dataQualityErrorRate:hospitalList){
				SolveDegreeWrapperResponse solveDegreeWrapperResponse = new SolveDegreeWrapperResponse();
				solveDegreeWrapperResponse.setUpHospital(dataQualityErrorRate.getUpHospital());
				solveDegreeWrapperResponse.setUpHospitalName(dataQualityErrorRate.getUpHospitalName());
				List<SolveDegreePeriodTime> solveDegreePeriodTimes = new ArrayList<>();
				for(int i=13;i>0;i--){
					SolveDegreePeriodTime solveDegreePeriodTime = new SolveDegreePeriodTime();
					Calendar calendarStart = Calendar.getInstance();
					calendarStart.setTime(currentTime);
					calendarStart.add(Calendar.DAY_OF_MONTH, -(i-1)*7);
					calendarStart.set(Calendar.DAY_OF_WEEK, 2);
					SolveDegree solveDegree = solveDegreeRepository.findByTimeAndSolveTypeAndUpHospital(calendarStart.getTime(), SolveType.week, dataQualityErrorRate.getUpHospital());
					if(solveDegree != null){
						solveDegreePeriodTime.setErrorCount(solveDegree.getErrorCount());
						solveDegreePeriodTime.setSolveCount(solveDegree.getSolveCount());
						solveDegreePeriodTime.setSolveRate(solveDegree.getSolveRate());
						solveDegreePeriodTime.setTime(solveDegree.getTime());
						solveDegreePeriodTimes.add(solveDegreePeriodTime);
					}
				}
				solveDegreeWrapperResponse.setSolveDegreePeriodTimes(weekSolveDegreeTimesFormat(solveDegreePeriodTimes,currentTime));
				solveDegreeWrapperResponses.add(solveDegreeWrapperResponse);
			}
		}
		if(rateStatisticsRequest.getStatisticsType().equals(StatisticsType.last12month)){
			for(SolveDegree dataQualityErrorRate:hospitalList){
				SolveDegreeWrapperResponse solveDegreeWrapperResponse = new SolveDegreeWrapperResponse();
				solveDegreeWrapperResponse.setUpHospital(dataQualityErrorRate.getUpHospital());
				solveDegreeWrapperResponse.setUpHospitalName(dataQualityErrorRate.getUpHospitalName());
				List<SolveDegreePeriodTime> solveDegreePeriodTimes = new ArrayList<>();
				for(int i = 12;i > 0; i--){
					SolveDegreePeriodTime solveDegreePeriodTime = new SolveDegreePeriodTime();
					Calendar calendarStart = Calendar.getInstance();
					calendarStart.setTime(currentTime);
					calendarStart.add(Calendar.MONTH, -(i-1));
					calendarStart.set(Calendar.DAY_OF_MONTH, 1);
					SolveDegree solveDegree = solveDegreeRepository.findByTimeAndSolveTypeAndUpHospital(calendarStart.getTime(), SolveType.month, dataQualityErrorRate.getUpHospital());
					if(solveDegree != null){
						solveDegreePeriodTime.setErrorCount(solveDegree.getErrorCount());
						solveDegreePeriodTime.setSolveCount(solveDegree.getSolveCount());
						solveDegreePeriodTime.setSolveRate(solveDegree.getSolveRate());
						solveDegreePeriodTime.setTime(solveDegree.getTime());
						solveDegreePeriodTimes.add(solveDegreePeriodTime);
					}
				}
				solveDegreeWrapperResponse.setSolveDegreePeriodTimes(monthSolveDegreeTimesFormat(solveDegreePeriodTimes,currentTime));
				solveDegreeWrapperResponses.add(solveDegreeWrapperResponse);
			}
		}
		return solveDegreeWrapperResponses;
	}
	
	
	@Override
	public List<RateStatisticResponse> rateStatistic(RateStatisticsRequest rateStatisticsRequest) {
		Sort sort = new Sort(Direction.ASC, "time");
		DecimalFormat df = new DecimalFormat("######0.00");   
	    Pageable pageable = new PageRequest(0, 1000000, sort);
		List<RateStatisticResponse> rateStatisticResponses = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date currentTime = new Date();
		try {
			currentTime = sdf.parse(sdf.format(rateStatisticsRequest.getEndTime()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		List<DataQualityErrorRate> hospitalList = dataErrorMsgService.getHospitals(rateStatisticsRequest.getUpHospital());
		
		if(rateStatisticsRequest.getStatisticsType().equals(StatisticsType.last30days)){
				Calendar calendarStart = Calendar.getInstance();
				calendarStart.setTime(currentTime);
				calendarStart.add(Calendar.DAY_OF_MONTH, -29);
				List<DataQualityErrorRate> dataQualityErrorRates = dataQualityErrorRateReposity.findByTimeLessThanEqualAndTimeGreaterThanEqual(currentTime, calendarStart.getTime(),pageable);
				for(DataQualityErrorRate hospital:hospitalList){
					RateStatisticResponse rateStatisticResponse = new RateStatisticResponse();
					rateStatisticResponse.setUpHospital(hospital.getUpHospital());
					rateStatisticResponse.setUpHospitalName(hospital.getUpHospitalName());
					List<ErrorDetailPeriodTime> errorDetailPeriodTimes = new ArrayList<>();
					for(DataQualityErrorRate dataQualityErrorRate:dataQualityErrorRates){
						if(hospital.getUpHospital().equals(dataQualityErrorRate.getUpHospital())){
							ErrorDetailPeriodTime errorDetailPeriodTime = new ErrorDetailPeriodTime();
							errorDetailPeriodTime.setErrorCount(dataQualityErrorRate.getErrorCount());
							errorDetailPeriodTime.setErrorRate(Float.parseFloat(df.format(dataQualityErrorRate.getErrorRate())));
							errorDetailPeriodTime.setMessageCount(dataQualityErrorRate.getMessageCount());
							errorDetailPeriodTime.setTime(dataQualityErrorRate.getTime());
							errorDetailPeriodTimes.add(errorDetailPeriodTime);
						}
					}
					rateStatisticResponse.setErrorDetailPeriodTimes(dayPeriodTimesFormat(errorDetailPeriodTimes,currentTime));
					rateStatisticResponses.add(rateStatisticResponse);
				}
			
		}
		if(rateStatisticsRequest.getStatisticsType().equals(StatisticsType.last13week)){
			for(DataQualityErrorRate hospital:hospitalList){
				RateStatisticResponse rateStatisticResponse = new RateStatisticResponse();
				rateStatisticResponse.setUpHospital(hospital.getUpHospital());
				rateStatisticResponse.setUpHospitalName(hospital.getUpHospitalName());
				List<ErrorDetailPeriodTime> errorDetailPeriodTimes = new ArrayList<>();
				for(int i = 13; i > 0;i--){
					Calendar calendarStart = Calendar.getInstance();
					Calendar calendarEnd = Calendar.getInstance();
					calendarStart.setTime(currentTime);
					if( i != 0){
						calendarStart.add(Calendar.DAY_OF_MONTH, -(i-1)*7+7);
						calendarStart.set(Calendar.DAY_OF_WEEK, 2);
					}
					calendarEnd.setTime(currentTime);
					calendarEnd.add(Calendar.DAY_OF_MONTH, -i*7+7);
					calendarEnd.set(Calendar.DAY_OF_WEEK, 2);
					List<DataQualityErrorRate> dataQualityErrorRates = dataQualityErrorRateReposity.findByTimeLessThanEqualAndTimeGreaterThanEqual(calendarStart.getTime(), calendarEnd.getTime(),pageable);
					
					ErrorDetailPeriodTime errorDetailPeriodTime = new ErrorDetailPeriodTime();
					for(DataQualityErrorRate dataQualityErrorRate:dataQualityErrorRates){
							if(hospital.getUpHospital().equals(dataQualityErrorRate.getUpHospital())){
								errorDetailPeriodTime.setErrorCount(errorDetailPeriodTime.getErrorCount() + dataQualityErrorRate.getErrorCount());
								errorDetailPeriodTime.setMessageCount(errorDetailPeriodTime.getMessageCount() + dataQualityErrorRate.getMessageCount());
							}
					}
					errorDetailPeriodTime.setTime(calendarEnd.getTime());
					if(errorDetailPeriodTime.getErrorCount() == 0 || errorDetailPeriodTime.getErrorCount() == null){
						errorDetailPeriodTime.setErrorRate(0);
					}else{
						errorDetailPeriodTime.setErrorRate(Float.parseFloat(df.format(((float)errorDetailPeriodTime.getErrorCount()*100)/errorDetailPeriodTime.getMessageCount())));
					}
					errorDetailPeriodTimes.add(errorDetailPeriodTime);
				}
				rateStatisticResponse.setErrorDetailPeriodTimes(weekPeriodTimesFormat(errorDetailPeriodTimes,currentTime));
				rateStatisticResponses.add(rateStatisticResponse);
			}
		}
		if(rateStatisticsRequest.getStatisticsType().equals(StatisticsType.last12month)){
			for(DataQualityErrorRate hospital:hospitalList){
				RateStatisticResponse rateStatisticResponse = new RateStatisticResponse();
				rateStatisticResponse.setUpHospital(hospital.getUpHospital());
				rateStatisticResponse.setUpHospitalName(hospital.getUpHospitalName());
				List<ErrorDetailPeriodTime> errorDetailPeriodTimes = new ArrayList<>();
				for(int i = 12; i > 0; i--){
					Calendar calendarStart = Calendar.getInstance();
					Calendar calendarEnd = Calendar.getInstance();
					calendarStart.setTime(currentTime);
					if(i != 0){
						calendarStart.add(Calendar.MONTH, -(i-1)+1);
						calendarStart.set(Calendar.DAY_OF_MONTH, 1);
					}
					calendarEnd.setTime(currentTime);
					calendarEnd.add(Calendar.MONTH, -i+1);
					calendarEnd.set(Calendar.DAY_OF_MONTH, 1);
					List<DataQualityErrorRate> dataQualityErrorRates = dataQualityErrorRateReposity.findByTimeLessThanEqualAndTimeGreaterThanEqual(calendarStart.getTime(),calendarEnd.getTime() ,pageable);
					ErrorDetailPeriodTime errorDetailPeriodTime = new ErrorDetailPeriodTime();
					for(DataQualityErrorRate dataQualityErrorRate:dataQualityErrorRates){
						if(hospital.getUpHospital().equals(dataQualityErrorRate.getUpHospital())){
							errorDetailPeriodTime.setErrorCount(errorDetailPeriodTime.getErrorCount() + dataQualityErrorRate.getErrorCount());
							errorDetailPeriodTime.setMessageCount(errorDetailPeriodTime.getMessageCount() + dataQualityErrorRate.getMessageCount());
						}
					}
					errorDetailPeriodTime.setTime(calendarEnd.getTime());
					if(errorDetailPeriodTime.getErrorCount() == 0){
						errorDetailPeriodTime.setErrorRate(0);
					}else{
						errorDetailPeriodTime.setErrorRate(Float.parseFloat(df.format(((float)errorDetailPeriodTime.getErrorCount()*100)/errorDetailPeriodTime.getMessageCount())));
					}
					errorDetailPeriodTimes.add(errorDetailPeriodTime);
				}
				rateStatisticResponse.setErrorDetailPeriodTimes(monthPeriodTimes(errorDetailPeriodTimes,currentTime));
				rateStatisticResponses.add(rateStatisticResponse);
			}
		}
		return rateStatisticResponses;
	}
	
	/*public static void main(String[] args) throws ParseException{
		String time = "2017-12-7";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(new Date().getDay());
		System.out.println(new Date().getMonth());
		System.out.println(new Date().getYear());
		System.out.println(sdf.format(new Date()));
		Date start = sdf.parse(time);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(sdf.parse(time));
		System.out.println("calendar.getFirstDayOfWeek()="+calendar.getFirstDayOfWeek());
		System.out.println("calendar.getWeeksInWeekYear()="+calendar.getWeeksInWeekYear());
		System.out.println("calendar.getWeekYear()="+calendar.getWeekYear());
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		
		System.out.println(sdf.format(calendar.getTime()));
		calendar.setTime(sdf.parse(time));
		System.out.println(sdf.format(calendar.getTime()));
		calendar.set(calendar.DAY_OF_WEEK, 2);
		System.out.println(sdf.format(calendar.getTime()));
	}*/
	
	private  List<ErrorDetailPeriodTime> dayPeriodTimesFormat(List<ErrorDetailPeriodTime> errorDetailPeriodTimes,Date currentTime){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendarStart = Calendar.getInstance();
		calendarStart.setTime(currentTime);
		calendarStart.add(Calendar.DAY_OF_MONTH, -29);
		Date startDate = calendarStart.getTime();
		List<Long> times = new ArrayList<>();
		Map<Long,ErrorDetailPeriodTime> map = new HashMap<>();
		for(int i = 0; i < 30; i++){
			ErrorDetailPeriodTime errorDetailPeriodTime = new ErrorDetailPeriodTime();
			calendarStart.setTime(startDate);
			calendarStart.add(Calendar.DAY_OF_MONTH, i);
			times.add(calendarStart.getTime().getTime());
			errorDetailPeriodTime.setTime(calendarStart.getTime());
			errorDetailPeriodTime.setMessageCount(-1L);
			map.put(calendarStart.getTime().getTime(), errorDetailPeriodTime);
		}
		for(int j = 0; j < times.size();j++){
			for(int k = 0; k < errorDetailPeriodTimes.size(); k++){
				if(times.get(j).equals(errorDetailPeriodTimes.get(k).getTime().getTime())){
					map.put(times.get(j), errorDetailPeriodTimes.get(k));
					break;
				}
			}
		}
		List<ErrorDetailPeriodTime> timeFormats = new ArrayList<>();
		for(int m = 0; m<times.size();m++){
			if(m == 29){
				continue;
			}
			ErrorDetailPeriodTime error = map.get(times.get(m));
			error.setDescribe("第"+(m+1)+"天");
			map.put(times.get(m), error);
			ErrorDetailPeriodTime errorDetailPeriodTime = map.get(times.get(m));
			timeFormats.add(map.get(times.get(m)));
		}
		return timeFormats;
		
	}
	private  List<ErrorDetailPeriodTime> weekPeriodTimesFormat(List<ErrorDetailPeriodTime> errorDetailPeriodTimes,Date currentTime){
		Calendar calendarStart = Calendar.getInstance();
		calendarStart.setTime(currentTime);
		Date startDate = calendarStart.getTime();
		List<Long> times = new ArrayList<>();
		Map<Long,ErrorDetailPeriodTime> map = new HashMap<>();
		for(int i = 13; i > 0; i--){
			ErrorDetailPeriodTime errorDetailPeriodTime = new ErrorDetailPeriodTime();
			errorDetailPeriodTime.setMessageCount(-1L);
			calendarStart.setTime(startDate);
			calendarStart.add(Calendar.DAY_OF_MONTH, -i*7+7);
			calendarStart.set(Calendar.DAY_OF_WEEK, 2);
			errorDetailPeriodTime.setTime(calendarStart.getTime());
			times.add(calendarStart.getTime().getTime());
			map.put(calendarStart.getTime().getTime(), errorDetailPeriodTime);
		}
		for(int j = 0; j < times.size(); j++){
			for(int k = 0; k < errorDetailPeriodTimes.size(); k++){
				if(times.get(j).equals(errorDetailPeriodTimes.get(k).getTime().getTime())){
					map.put(times.get(j), errorDetailPeriodTimes.get(k));
					break;
				}
			}
		}
		List<ErrorDetailPeriodTime> weekTimesFormats = new ArrayList<>();
		for(int m = 0; m<times.size();m++){
			ErrorDetailPeriodTime error = map.get(times.get(m));
			error.setDescribe("第"+(m+1)+"周");
			map.put(times.get(m), error);
			weekTimesFormats.add(map.get(times.get(m)));
		}
		return weekTimesFormats;
		
	}
	private  List<ErrorDetailPeriodTime> monthPeriodTimes(List<ErrorDetailPeriodTime> errorDetailPeriodTimes,Date currentTime){
		Calendar calendarStart = Calendar.getInstance();
		calendarStart.setTime(currentTime);
		Date startDate = calendarStart.getTime();
		List<Long> times = new ArrayList<>();
		Map<Long,ErrorDetailPeriodTime> map = new HashMap<>();
		for(int i = 12;i>0;i--){
			calendarStart.setTime(startDate);
			calendarStart.add(Calendar.MONTH, -i+1);
			calendarStart.set(Calendar.DAY_OF_MONTH, 1);
			ErrorDetailPeriodTime errorDetailPeriodTime = new ErrorDetailPeriodTime();
			errorDetailPeriodTime.setMessageCount(-1L);
			errorDetailPeriodTime.setTime(calendarStart.getTime());
			errorDetailPeriodTime.setErrorRate(0);
			times.add(calendarStart.getTime().getTime());
			map.put(calendarStart.getTime().getTime(), errorDetailPeriodTime);
		}
		for(int j = 0; j < times.size(); j++){
			for(int k = 0; k < errorDetailPeriodTimes.size();k++){
				if(times.get(j).equals(errorDetailPeriodTimes.get(k).getTime().getTime())){
					map.put(times.get(j), errorDetailPeriodTimes.get(k));
					break;
				}
			}
		}
		List<ErrorDetailPeriodTime> monthTimesFormats = new ArrayList<>();
		for(int m = 0; m<times.size();m++){
			ErrorDetailPeriodTime error = map.get(times.get(m));
			error.setDescribe("第"+(m+1)+"个月");
			map.put(times.get(m), error);
			monthTimesFormats.add(map.get(times.get(m)));
		}
		return monthTimesFormats;
	}
	
	private List<SolveDegreePeriodTime> daySolveDegreeTimesFormat(List<SolveDegreePeriodTime> solveDegreePeriodTimes,Date currentTime){
		Calendar calendarStart = Calendar.getInstance();
		calendarStart.setTime(currentTime);
		calendarStart.add(Calendar.DAY_OF_MONTH, -29);
		Date startDate = calendarStart.getTime();
		List<Long> times = new ArrayList<>();
		Map<Long,SolveDegreePeriodTime> map = new HashMap<>();
		for(int i = 0; i < 30; i++){
			SolveDegreePeriodTime solveDegreePeriodTime = new SolveDegreePeriodTime();
			calendarStart.setTime(startDate);
			calendarStart.add(Calendar.DAY_OF_MONTH, i);
			times.add(calendarStart.getTime().getTime());
			solveDegreePeriodTime.setTime(calendarStart.getTime());;
			solveDegreePeriodTime.setSolveCount(-1);;
			map.put(calendarStart.getTime().getTime(), solveDegreePeriodTime);
		}
		for(int j = 0; j < times.size();j++){
			for(int k = 0; k < solveDegreePeriodTimes.size(); k++){
				if(times.get(j).equals(solveDegreePeriodTimes.get(k).getTime().getTime())){
					map.put(times.get(j), solveDegreePeriodTimes.get(k));
					break;
				}
			}
		}
		List<SolveDegreePeriodTime> timeFormats = new ArrayList<>();
		for(int m = 0; m<times.size();m++){
			SolveDegreePeriodTime error = map.get(times.get(m));
			error.setDescribe("第"+(m+1)+"天");
			map.put(times.get(m), error);
			SolveDegreePeriodTime errorDetailPeriodTime = map.get(times.get(m));
			timeFormats.add(map.get(times.get(m)));
		}
		return timeFormats;
		
		
	}
	
	private List<SolveDegreePeriodTime> weekSolveDegreeTimesFormat(List<SolveDegreePeriodTime> solveDegreePeriodTimes,Date currentTime){
		Calendar calendarStart = Calendar.getInstance();
		calendarStart.setTime(currentTime);
		Date startDate = calendarStart.getTime();
		List<Long> times = new ArrayList<>();
		Map<Long,SolveDegreePeriodTime> map = new HashMap<>();
		for(int i = 13; i > 0; i--){
			SolveDegreePeriodTime errorDetailPeriodTime = new SolveDegreePeriodTime();
			errorDetailPeriodTime.setSolveCount(-1);
			calendarStart.setTime(startDate);
			calendarStart.add(Calendar.DAY_OF_MONTH, -i*7+7);
			calendarStart.set(Calendar.DAY_OF_WEEK, 2);
			errorDetailPeriodTime.setTime(calendarStart.getTime());
			times.add(calendarStart.getTime().getTime());
			map.put(calendarStart.getTime().getTime(), errorDetailPeriodTime);
		}
		for(int j = 0; j < times.size(); j++){
			for(int k = 0; k < solveDegreePeriodTimes.size(); k++){
				if(times.get(j).equals(solveDegreePeriodTimes.get(k).getTime().getTime())){
					map.put(times.get(j), solveDegreePeriodTimes.get(k));
					break;
				}
			}
		}
		List<SolveDegreePeriodTime> weekTimesFormats = new ArrayList<>();
		for(int m = 0; m<times.size();m++){
			SolveDegreePeriodTime error = map.get(times.get(m));
			error.setDescribe("第"+(m+1)+"周");
			map.put(times.get(m), error);
			weekTimesFormats.add(map.get(times.get(m)));
		}
		return weekTimesFormats;
	}
	
	private List<SolveDegreePeriodTime> monthSolveDegreeTimesFormat(List<SolveDegreePeriodTime> solveDegreePeriodTimes,Date currentTime){
		Calendar calendarStart = Calendar.getInstance();
		calendarStart.setTime(currentTime);
		Date startDate = calendarStart.getTime();
		List<Long> times = new ArrayList<>();
		Map<Long,SolveDegreePeriodTime> map = new HashMap<>();
		for(int i = 12;i>0;i--){
			calendarStart.setTime(startDate);
			calendarStart.add(Calendar.MONTH, -i+1);
			calendarStart.set(Calendar.DAY_OF_MONTH, 1);
			SolveDegreePeriodTime errorDetailPeriodTime = new SolveDegreePeriodTime();
			errorDetailPeriodTime.setSolveCount(-1);
			errorDetailPeriodTime.setTime(calendarStart.getTime());
			times.add(calendarStart.getTime().getTime());
			map.put(calendarStart.getTime().getTime(), errorDetailPeriodTime);
		}
		for(int j = 0; j < times.size(); j++){
			for(int k = 0; k < solveDegreePeriodTimes.size();k++){
				if(times.get(j).equals(solveDegreePeriodTimes.get(k).getTime().getTime())){
					map.put(times.get(j), solveDegreePeriodTimes.get(k));
					break;
				}
			}
		}
		List<SolveDegreePeriodTime> monthTimesFormats = new ArrayList<>();
		for(int m = 0; m<times.size();m++){
			SolveDegreePeriodTime error = map.get(times.get(m));
			error.setDescribe("第"+(m+1)+"个月");
			map.put(times.get(m), error);
			monthTimesFormats.add(map.get(times.get(m)));
		}
		return monthTimesFormats;
	}
	
	/*public static void main(String[] args) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<ErrorDetailPeriodTime> errorDetailPeriodTimes = new ArrayList<>();
		Date currentTime = sdf.parse(sdf.format(new Date()));
		ErrorDetailPeriodTime error1 = new ErrorDetailPeriodTime();
		error1.setErrorCount(1);
		error1.setErrorRate(0.5f);
		error1.setMessageCount(1);
		error1.setTime(currentTime);
		errorDetailPeriodTimes.add(error1);
		List<ErrorDetailPeriodTime> formatTimes1 = dayPeriodTimesFormat(errorDetailPeriodTimes,currentTime);
		List<ErrorDetailPeriodTime> formatTimes2 = weekPeriodTimesFormat(errorDetailPeriodTimes, currentTime);
		List<ErrorDetailPeriodTime> formatTimes3 = monthPeriodTimes(errorDetailPeriodTimes, currentTime);
	}*/
	

}
