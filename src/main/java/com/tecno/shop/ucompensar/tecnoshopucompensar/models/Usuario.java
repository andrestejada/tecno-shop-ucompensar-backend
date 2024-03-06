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

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false ,unique = true )
    private String correo;

    @Column(nullable = false)
    private String password;

    @OneToMany
    @JoinColumn(name = "usuario_id")
    private List<Comentario> comentarios;

    @OneToMany
    @JoinColumn(name = "usuario_id")
    private List<Producto> productos;


}
