package com.nestvision.nest.proxy.nest.service;

import java.util.List;

import com.nestvision.nest.proxy.model.FieldModel;

public interface FieldModelService {
    public void loadFieldModelMaps();
    
    
    public List<FieldModel> getFieldModels(String name);
}
