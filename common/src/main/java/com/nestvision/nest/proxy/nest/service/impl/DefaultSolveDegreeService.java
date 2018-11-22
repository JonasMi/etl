package com.nestvision.nest.proxy.nest.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.nest.dao.SolveDegreeRepository;
import com.nestvision.nest.proxy.nest.entity.SolveDegree;
import com.nestvision.nest.proxy.nest.service.SolveDegreeService;

/*@Service*/
public class DefaultSolveDegreeService extends AbstractBaseService<SolveDegree, String> implements SolveDegreeService {

	@Autowired
	private SolveDegreeRepository solveDegreeRepository;
	@Override
	protected BaseRepository<SolveDegree, String> getBaseRepository() {
		return solveDegreeRepository;
	}

	

}
