package com.zemno.serverapplication.salonserver.repository;

import com.zemno.serverapplication.salonserver.model.ServiceUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ServiceUnitRepo extends JpaRepository<ServiceUnit, Long> {

    public Optional<ServiceUnit> findByType(String type);
    public boolean existsByType(String type);
}
