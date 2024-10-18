package com.example.rsc.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Reserva {

    @Id
    private Integer id;

    private Integer usuarioId;

    private Integer ofertaId;

    private LocalDateTime fechaReserva;

    private Double totalPago;

}
