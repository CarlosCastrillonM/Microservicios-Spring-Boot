package com.example.rsc.dto;

import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.Date;

public class ReservaDto {

    private Integer id;
    private Integer usuarioId;
    private Integer ofertaId;
    private LocalDateTime fechaReserva;
    private double totalPago;

    public ReservaDto(Integer id, Integer usuarioId, Integer ofertaId, LocalDateTime fechaReserva, double totalPago) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.ofertaId = ofertaId;
        this.fechaReserva = fechaReserva;
        this.totalPago = totalPago;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Integer getOfertaId() {
        return ofertaId;
    }

    public void setOfertaId(Integer ofertaId) {
        this.ofertaId = ofertaId;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }

    @Override
    public String toString() {
        return "ReservaDto{" +
                "id='" + id + '\'' +
                ", usuarioId='" + usuarioId + '\'' +
                ", ofertaId='" + ofertaId + '\'' +
                ", fechaReserva=" + fechaReserva +
                ", totalPago=" + totalPago +
                '}';
    }
}
