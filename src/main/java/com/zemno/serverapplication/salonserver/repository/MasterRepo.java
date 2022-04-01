package com.zemno.serverapplication.salonserver.repository;

import com.zemno.serverapplication.salonserver.model.Master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterRepo extends JpaRepository<Master, Long> {

    public boolean existsByName(String name);
}
