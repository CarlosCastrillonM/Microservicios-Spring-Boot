package com.example.rsc.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transporte {

    @Id
    private Integer id;

    private String tipoTransporte;

    private String marca;

    private Integer capacidad;
}
