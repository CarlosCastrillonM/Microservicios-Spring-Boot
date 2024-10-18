package com.example.rsc.dto;

public class TransporteDto {

    private Integer id;
    private String tipoTransporte;
    private String marca;
    private Integer capacidad;

    public TransporteDto(Integer id, String tipoTransporte, String marca, Integer capacidad) {
        this.id = id;
        this.tipoTransporte = tipoTransporte;
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "TransporteDto{" +
                "id=" + id +
                ", tipoTransporte='" + tipoTransporte + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
