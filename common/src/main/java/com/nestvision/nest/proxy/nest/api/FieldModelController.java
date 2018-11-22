package com.nestvision.nest.proxy.nest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nestvision.nest.proxy.model.FieldModel;
import com.nestvision.nest.proxy.nest.service.FieldModelService;

@RestController
@RequestMapping("/api/field")
public class FieldModelController {
    
    @Autowired
    private FieldModelService fieldModelService;
    
    @GetMapping("/{name}/")
    public List<FieldModel> getFieldModel(@PathVariable String name){
        return fieldModelService.getFieldModels(name);
    }
}
