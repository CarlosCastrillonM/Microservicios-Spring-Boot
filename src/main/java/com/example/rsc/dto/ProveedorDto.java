package com.example.rsc.dto;

public class ProveedorDto {
    private Integer id;
    private String nombre;
    private String tipoProveedor;
    private String email;
    private String telefono;

    public ProveedorDto(Integer id, String nombre, String tipoProveedor, String mail, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.tipoProveedor = tipoProveedor;
        this.email = mail;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoProveedor() {
        return tipoProveedor;
    }

    public void setTipoProveedor(String tipoProveedor) {
        this.tipoProveedor = tipoProveedor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "ProveedorDto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipoProveedor='" + tipoProveedor + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
