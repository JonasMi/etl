package com.nestvision.nest.proxy.test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.OperationState;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.SystemType;

public abstract class MessageGenaratorSupport<T extends FhirResourceEntity> {

    protected boolean isSenderMessage = false;

    protected boolean isDeleteTable = false;

    private int fullEntityNumbers = 1;

    private int nessarayEntityNumbers = 1;

    protected void setCommonProperties(FhirResourceEntity fhirResourceEntity) {

        fhirResourceEntity.setUid(UUID.randomUUID().toString());
        fhirResourceEntity.setDealState(DealState.UNPROCESSED);
        fhirResourceEntity.setDeveloper("sinosoft");
        fhirResourceEntity.setOperationState(OperationState.CREATE);
        fhirResourceEntity.setUpHospital(TestConstants.HOSPITAL_ID);
        fhirResourceEntity.setDeveloperSystemType(SystemType.his);
    }

    public T genarate(Class<T> clazz, boolean full) throws Exception {
        T fhirResourceEntity = null;
        if (full) {
            fhirResourceEntity = EntityGenarator.genarate(clazz);
        } else {
            fhirResourceEntity = EntityGenarator.genarateNessaray(clazz);
        }
        setCommonProperties(fhirResourceEntity);
        setSpecialProperties(fhirResourceEntity);
        return fhirResourceEntity;
    }

    public List<T> genarateFullEntities(Class<T> clazz) throws Exception {

        List<T> fullEntities = new ArrayList<>();
        for (int i = 0; i < fullEntityNumbers; i++) {
            fullEntities.add(genarate(clazz, true));
        }
        return fullEntities;

    }

    public List<T> genarateNessarayEntities(Class<T> clazz) throws Exception {

        List<T> fullEntities = new ArrayList<>();
        for (int i = 0; i < nessarayEntityNumbers; i++) {
            fullEntities.add(genarate(clazz, false));
        }
        return fullEntities;

    }

    protected abstract void setSpecialProperties(T fhirResourceEntity);

    public void setFullEntityNumbers(int fullEntityNumbers) {
        this.fullEntityNumbers = fullEntityNumbers;
    }

    public int getFullEntityNumbers() {
        return fullEntityNumbers;
    }

    public int getNessarayEntityNumbers() {
        return nessarayEntityNumbers;
    }

    public void setNessarayEntityNumbers(int nessarayEntityNumbers) {
        this.nessarayEntityNumbers = nessarayEntityNumbers;
    }
}
