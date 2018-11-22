package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.DeathProofRepository;
import com.nestvision.nest.proxy.fhir.entity.DeathProof;
import com.nestvision.nest.proxy.fhir.service.DeathProofService;

@Service
public class DefaultDeathProofService extends AbstractBaseService<DeathProof, String> implements DeathProofService {

    @Autowired
    private DeathProofRepository deathProofRepository;

    @Override
    protected BaseRepository<DeathProof, String> getBaseRepository() {

        return deathProofRepository;
    }

}
