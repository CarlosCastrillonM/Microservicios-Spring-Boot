package com.example.rsc.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "reservas")
@Getter
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer usuarioId;

    @Column(name = "oferta_id")
    private Integer ofertaId;

    @Column(name = "fecha_reserva")
    private LocalDateTime fechaReserva;

    @Column(name = "total_pago")
    private Double totalPago;

}
