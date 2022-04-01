package com.zemno.serverapplication.salonserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "sales")
@NoArgsConstructor
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Long id;
    @JsonProperty("date")
    private LocalDate date;
    @JsonProperty("service_name")
    private String serviceName;
    @JsonProperty("service_type")
    private String serviceType;
    @JsonProperty("sale_detail")
    private String saleDetail;
    @JsonProperty("total_cost")
    private Double totalCost;
    @JsonProperty("master_name")
    private String masterName;
}
