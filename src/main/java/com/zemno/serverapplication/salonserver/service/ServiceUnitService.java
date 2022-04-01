package com.zemno.serverapplication.salonserver.service;

import com.zemno.serverapplication.salonserver.model.ServiceUnit;
import com.zemno.serverapplication.salonserver.repository.ServiceUnitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceUnitService {

    @Autowired
    private ServiceUnitRepo serviceUnitRepo;

    public List<ServiceUnit> getAll() {
        return serviceUnitRepo.findAll();
    }

    public boolean add(ServiceUnit serviceUnit) {
        if (serviceUnitRepo.findByType(serviceUnit.getType()).isPresent())
            return false;
        else {
            serviceUnitRepo.save(serviceUnit);
            return true;
        }
    }

    public ServiceUnit findById(Long id) {
        return serviceUnitRepo.findById(id).get();
    }

    public boolean update(ServiceUnit serviceUnit) {
        boolean b = serviceUnitRepo.existsByType(serviceUnit.getType());
        Optional<ServiceUnit> byId = serviceUnitRepo.findById(serviceUnit.getId());
        if (serviceUnit.getType().equals(byId.get().getType()) || !serviceUnitRepo.existsByType(serviceUnit.getType())){
            serviceUnitRepo.save(serviceUnit);
            return true;
        }
        return false;
    }

    public void delete(Long id) {
        serviceUnitRepo.deleteById(id);
    }
}
