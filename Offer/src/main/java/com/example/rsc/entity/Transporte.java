package com.example.rsc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

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
