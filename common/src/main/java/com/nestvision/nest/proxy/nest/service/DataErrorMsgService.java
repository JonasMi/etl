package com.nestvision.nest.proxy.nest.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nestvision.nest.proxy.nest.api.request.CoordinatorReferenceRequest;
import com.nestvision.nest.proxy.nest.api.request.DataQualityRequest;
import com.nestvision.nest.proxy.nest.api.response.CoordinatorReferenceHospital;
import com.nestvision.nest.proxy.nest.api.response.CoordinatorReferenceInterface;
import com.nestvision.nest.proxy.nest.api.response.CoordinatorReferenceMessage;
import com.nestvision.nest.proxy.nest.api.response.FireInterfaceDataItem;
import com.nestvision.nest.proxy.nest.api.response.FireInterfaceErrorType;
import com.nestvision.nest.proxy.nest.api.response.FireInterfacePrimaryKey;
import com.nestvision.nest.proxy.nest.entity.DataQualityErrorRate;
import com.nestvision.nest.proxy.nest.entity.InterfaceDataQualityReport;
import com.nestvision.nest.proxy.nest.entity.SamplingIdentifers;
import com.nestvision.nest.proxy.nest.entity.SolveDegree;
import com.nestvision.nest.proxy.nest.service.impl.DefaultDataQualityReportService.QueryType;

public interface DataErrorMsgService {
	public void createDateErrorMsgTable();
	
	public void save(String tableName,InterfaceDataQualityReport interfaceDataQualityReport);
	
	public void delete(String tableName,String identifier);
	
	public List<String> getMessageIds(String tableName,String identifier);
	
	public Page<FireInterfacePrimaryKey> findMessageByDateItem(String dataItem, Pageable pageable, QueryType queryType, String logicName, String upHospital,
            String path, String errorCode,DataQualityRequest dataQualityRequest);
	
	public String getTableName(String upHospitalName,String interfaceLogicName);
	
	public List<FireInterfaceErrorType> findErrorTypes(String logicName, String upHospital,
			DataQualityRequest dataQualityRequest);
	
	public Page<FireInterfaceDataItem> findDataItemsByErrorType(String logicName, Pageable pageable, String upHospital,
			String errorType, DataQualityRequest dataQualityRequest,QueryType queryType);
	
	public List<CoordinatorReferenceHospital> findHospitalReference(String hospital);
	
	public List<CoordinatorReferenceInterface> findInterfaceReference(String hospital,String logicName);
	
	public List<CoordinatorReferenceMessage> findMessageReference(String hospital,String logicName,String identifier);
	
	public List<String> getIdentifiers(CoordinatorReferenceRequest coordinatorReferenceRequest);
	
	public List<String> getHospitalIdentifiers(CoordinatorReferenceRequest coordinatorReferenceRequest);
	
	public List<String> getInterfaceIdentifiers(CoordinatorReferenceRequest coordinatorReferenceRequest);
	
	public List<DataQualityErrorRate> getHospitals(String upHospital);
	
	public List<SolveDegree> getSolveDegreeHospitals(String upHospital); 
	
	public void deleteReferenceMessage(String upHospital,
			String logicInterfaceName, String identifier);
	
	public void updateReferenceMessage(String upHospital,
			String logicInterfaceName, String identifier);
	
	public int getAllCount(String logicName, String upHospital, DataQualityRequest dataQualityRequest);
	
	public void deteteMessageConfirmationByUptime(Date time);
	
	public SamplingIdentifers findByTimeAndUpHospital(Date time,String upHospital);
	
	public void timeIncrementTableInit();
	
	public void saveTimeIncrement(long timeIncrement);
	
}
