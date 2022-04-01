package com.zemno.serverapplication.salonserver.controller;

import com.zemno.serverapplication.salonserver.model.ServiceUnit;
import com.zemno.serverapplication.salonserver.service.ServiceUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServiceUnitController {

    @Autowired
    private ServiceUnitService serviceUnitService;

    @GetMapping("/serviceUnits")
    public List<ServiceUnit> getAll(){
        return serviceUnitService.getAll();
    }

    @PostMapping("/serviceUnit")
    public boolean add(@RequestBody ServiceUnit serviceUnit){
        return serviceUnitService.add(serviceUnit);
    }

    @GetMapping("/serviceUnit/{id}")
    public ServiceUnit get(@PathVariable Long id){
        return serviceUnitService.findById(id);
    }

    @PutMapping("/serviceUnit/update")
    public boolean update(@RequestBody ServiceUnit serviceUnit){
        return serviceUnitService.update(serviceUnit);
    }

    @DeleteMapping("/serviceUnit/{id}")
    public void delete(@PathVariable Long id){
         serviceUnitService.delete(id);
    }
}
