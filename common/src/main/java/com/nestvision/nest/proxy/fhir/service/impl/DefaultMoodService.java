package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.MoodRepository;
import com.nestvision.nest.proxy.fhir.entity.Mood;
import com.nestvision.nest.proxy.fhir.service.MoodService;

@Service
public class DefaultMoodService extends AbstractBaseService<Mood, String> implements MoodService {

    @Autowired
    private MoodRepository moodRepository;

    @Override
    protected BaseRepository<Mood, String> getBaseRepository() {

        return moodRepository;
    }

}
