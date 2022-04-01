package com.zemno.serverapplication.salonserver.controller;

import com.zemno.serverapplication.salonserver.model.Master;
import com.zemno.serverapplication.salonserver.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MasterController {

    @Autowired
    private MasterService masterService;

    @GetMapping("/masters")
    private List<Master> getAll(){
        return masterService.getAll();
    }

    @PostMapping("/master")
    public boolean add(@RequestBody Master master){
        return masterService.add(master);
    }

    @DeleteMapping("/master/{id}")
    public void delete(@PathVariable Long id){
        masterService.delete(id);
    }
}
