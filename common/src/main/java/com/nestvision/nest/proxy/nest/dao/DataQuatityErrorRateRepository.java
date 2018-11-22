package com.nestvision.nest.proxy.nest.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Pageable;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.nest.entity.DataQualityErrorRate;

public interface DataQuatityErrorRateRepository extends BaseRepository<DataQualityErrorRate, String> {
	public List<DataQualityErrorRate> findByTimeLessThanEqualAndTimeGreaterThanEqual(Date end,Date start,Pageable pageable);
}
