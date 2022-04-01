package com.zemno.serverapplication.salonserver.service;

import com.zemno.serverapplication.salonserver.model.Master;
import com.zemno.serverapplication.salonserver.repository.MasterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasterService {

    @Autowired
    private MasterRepo masterRepo;


    public List<Master> getAll() {
        return masterRepo.findAll();
    }

    public boolean add(Master master) {
        if (!masterRepo.existsByName(master.getName())){
            masterRepo.save(master);
            return true;
        }
        return false;
    }

    public void delete(Long id) {
        masterRepo.deleteById(id);
    }
}
