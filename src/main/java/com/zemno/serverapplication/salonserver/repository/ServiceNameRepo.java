package com.zemno.serverapplication.salonserver.repository;

import com.zemno.serverapplication.salonserver.model.ServiceName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceNameRepo extends JpaRepository<ServiceName, Long> {

    public boolean existsByName(String name);
}
