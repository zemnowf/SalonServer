package com.zemno.serverapplication.salonserver.service;

import com.zemno.serverapplication.salonserver.model.ServiceName;
import com.zemno.serverapplication.salonserver.repository.ServiceNameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceNameService {

    @Autowired
    private ServiceNameRepo serviceNameRepo;

    public List<ServiceName> getAll() {
        return serviceNameRepo.findAll();
    }

    public boolean add(ServiceName serviceName) {
        if (!serviceNameRepo.existsByName(serviceName.getName())){
            serviceNameRepo.save(serviceName);
            return true;
        }
        return false;
    }

    public void delete(Long id) {
        serviceNameRepo.deleteById(id);
    }
}
