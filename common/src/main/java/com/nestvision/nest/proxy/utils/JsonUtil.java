package com.nestvision.nest.proxy.utils;

import com.fasterxml.jackson.databind.JavaType;
import com.nestvision.nest.proxy.model.FieldModel;

import java.util.ArrayList;
import java.util.Map;

public interface JsonUtil {

     Jsons INSTANCE = Jsons.DEFAULT;

     JavaType LIST_CONFIG_FIELD_TYPE = INSTANCE.createCollectionType(ArrayList.class, FieldModel.class);

     JavaType MAP_STR_STR_TYPE = INSTANCE.createCollectionType(Map.class, String.class, String.class);
     
     JavaType MAP_STR_FIELD_TYPE = INSTANCE.createCollectionType(Map.class, String.class,FieldModel.class);
}
