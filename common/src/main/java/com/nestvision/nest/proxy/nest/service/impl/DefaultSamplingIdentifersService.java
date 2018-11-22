package com.nestvision.nest.proxy.nest.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.nest.dao.SamplingIdentifersRepository;
import com.nestvision.nest.proxy.nest.entity.SamplingIdentifers;
import com.nestvision.nest.proxy.nest.service.SamplingIdentifersService;

/*@Service*/
public class DefaultSamplingIdentifersService extends AbstractBaseService<SamplingIdentifers, String>
		implements SamplingIdentifersService {
	@Autowired
	private SamplingIdentifersRepository samplingIdentifersRepository;
	@Override
	protected BaseRepository<SamplingIdentifers, String> getBaseRepository() {
		return samplingIdentifersRepository;
	}

	
}
