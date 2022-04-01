package com.zemno.serverapplication.salonserver.controller;

import com.zemno.serverapplication.salonserver.model.ServiceName;
import com.zemno.serverapplication.salonserver.service.ServiceNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServiceNameController {

    @Autowired
    private ServiceNameService serviceNameService;

    @GetMapping("/serviceNames")
    public List<ServiceName> getAll(){
        return serviceNameService.getAll();
    }

    @PostMapping("/serviceName")
    public boolean add(@RequestBody ServiceName serviceName){
        return serviceNameService.add(serviceName);
    }

    @DeleteMapping("/serviceName/{id}")
    public void delete(@PathVariable Long id){
        serviceNameService.delete(id);
    }
}
