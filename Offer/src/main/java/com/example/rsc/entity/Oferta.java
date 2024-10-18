package com.example.rsc.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Oferta {

    @Id
    private Integer id;

    private Transporte transporte;

    private Proveedor proveedor;

    private LocalDateTime fechaHoraSalida;

    private String origen;

    private String destino;

}
