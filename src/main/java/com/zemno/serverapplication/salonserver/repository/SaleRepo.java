package com.zemno.serverapplication.salonserver.repository;

import com.zemno.serverapplication.salonserver.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepo extends JpaRepository<Sale, Long> {

}
