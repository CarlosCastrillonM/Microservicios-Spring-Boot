package com.example.rsc.dto;

import java.time.LocalDateTime;

public class OfertaDto {
    private Integer id;
    private TransporteDto transporteDto;
    private ProveedorDto proveedorDto;
    private LocalDateTime departureDateTime;
    private String origen;
    private String destino;

    public OfertaDto(Integer id, TransporteDto transport, ProveedorDto proveedorDto, LocalDateTime departureDateTime, String origen, String destino) {
        this.id = id;
        this.transporteDto = transport;
        this.proveedorDto = proveedorDto;
        this.departureDateTime = departureDateTime;
        this.origen = origen;
        this.destino = destino;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TransporteDto getTransporteDto() {
        return transporteDto;
    }

    public void setTransporteDto(TransporteDto transporteDto) {
        this.transporteDto = transporteDto;
    }

    public ProveedorDto getProveedorDto() {
        return proveedorDto;
    }

    public void setProveedorDto(ProveedorDto proveedorDto) {
        this.proveedorDto = proveedorDto;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(LocalDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "OfertaDto{" +
                "id=" + id +
                ", transporteDto=" + transporteDto +
                ", proveedorDto=" + proveedorDto +
                ", departureDateTime=" + departureDateTime +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }
}
