package com.zemno.serverapplication.salonserver.service;

import com.zemno.serverapplication.salonserver.model.Sale;
import com.zemno.serverapplication.salonserver.repository.SaleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepo saleRepo;

    public List<Sale> getAll() {
        return saleRepo.findAll();
    }

    public Sale add(Sale sale) {
        saleRepo.save(sale);
        return sale;
    }
}
