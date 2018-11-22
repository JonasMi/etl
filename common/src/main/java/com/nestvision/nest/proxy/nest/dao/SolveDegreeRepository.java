package com.nestvision.nest.proxy.nest.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Pageable;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.nest.entity.SolveDegree;
import com.nestvision.nest.proxy.nest.entity.SolveDegree.SolveType;

public interface SolveDegreeRepository extends BaseRepository<SolveDegree, String> {
	public List<SolveDegree> findByTimeLessThanEqualAndTimeGreaterThanEqualAndSolveType(Date end,Date start,SolveType solveType,Pageable pageable);
	public SolveDegree findByTimeAndSolveTypeAndUpHospital(Date time,SolveType solveType,String upHospital);
}
