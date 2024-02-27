package com.tecno.shop.ucompensar.tecnoshopucompensar.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue
    private Integer id;

    private String nombre;
    private String correo;
    private String password;

    @OneToMany
    @JoinColumn(name = "usuario_id")
    private List<Comentario> comentarios;

    @OneToMany
    @JoinColumn(name = "usuario_id")
    private List<Producto> productos;


}
