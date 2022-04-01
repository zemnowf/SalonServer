package com.zemno.serverapplication.salonserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "service_units")
@NoArgsConstructor
public class ServiceUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Long id;
    @JsonProperty("detail")
    private String detail;
    @JsonProperty("service_unit_cost")
    private Double unitCost;
    @JsonProperty("type")
    private String type;
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonProperty("master")
    private Master master;
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonProperty("serviceName")
    private ServiceName serviceName;

}
