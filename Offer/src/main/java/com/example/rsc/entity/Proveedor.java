package com.example.rsc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor {

    @Id
    private Integer id;

    private String nombre;

    private String tipoProveedor;

    private String email;

    private String telefono;

}
