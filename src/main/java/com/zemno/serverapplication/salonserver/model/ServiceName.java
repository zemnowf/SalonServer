package com.zemno.serverapplication.salonserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "service_names")
@NoArgsConstructor
public class ServiceName {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
}
