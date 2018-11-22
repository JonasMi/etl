package com.nestvision.nest.proxy.freemarker.method;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nestvision.nest.proxy.fhir.service.FhirDataMappingService;

import freemarker.template.SimpleScalar;
import freemarker.template.TemplateModelException;
import freemarker.template.TemplateScalarModel;

@Component
public class MappingValueMethod implements FreeMarkerCustomMethod {

    @Autowired
    private FhirDataMappingService fhirDataMappingService;

    private static final String GENDER_MAPPING_TABLE = "GBT22611";

    private static final Map<String, String> GENDER_MAPPINGS = new HashMap<>();

    static {
        GENDER_MAPPINGS.put("0", "unknown");
        GENDER_MAPPINGS.put("1", "male");
        GENDER_MAPPINGS.put("2", "female");
        GENDER_MAPPINGS.put("9", "other");
    }

    public MappingValueMethod(FhirDataMappingService fhirDataMappingService) {
        this.fhirDataMappingService = fhirDataMappingService;
    }

    @Override
    public Object exec(List arguments) throws TemplateModelException {

        if (arguments.size() < 2) {
            throw new TemplateModelException("MappingValue函数至少需要指定\"映射表名称\"与\"映射表\"的键两个参数");
        }
        if (arguments.size() > 3) {
            throw new TemplateModelException("MappingValue函数最多只能指定\"映射表名称\",\"映射表的键\"和\"默认值\"三个参数");
        }

        TemplateScalarModel tableNameScalarModel = (TemplateScalarModel) arguments.get(0);
        String tableName = tableNameScalarModel.getAsString();
        TemplateScalarModel keyScalarModel = (TemplateScalarModel) arguments.get(1);
        String key = keyScalarModel.getAsString();
        String defaultValue = null;
        if (arguments.size() == 3) {
            TemplateScalarModel defaultValueScalarModel = (TemplateScalarModel) arguments.get(2);
            defaultValue = defaultValueScalarModel.getAsString();
        }

        String result = null;

        if (!GENDER_MAPPING_TABLE.equals(tableName)) {

            result = fhirDataMappingService.getMappingValue(tableName, key, defaultValue);

        } else {
            result = GENDER_MAPPINGS.get(key);

        }
        if (result == null) {
            result = defaultValue;
        }
        if (result != null) {
            return new SimpleScalar(result);
        }
        return null;

    }

}
