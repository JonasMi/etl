package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.MpdRepository;
import com.nestvision.nest.proxy.fhir.entity.Mpd;
import com.nestvision.nest.proxy.fhir.service.MpdService;

@Service
public class DefaultMpdService extends AbstractBaseService<Mpd, String> implements MpdService {

    @Autowired
    private MpdRepository mpdRepository;

    @Override
    protected BaseRepository<Mpd, String> getBaseRepository() {

        return mpdRepository;
    }

}
