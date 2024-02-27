package com.tecno.shop.ucompensar.tecnoshopucompensar.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    @Id
    @GeneratedValue
    private Integer id;

    private String titulo;
    private String imagenUrl;
    private String descripcion;
    private String precio;
    private Integer unidades;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_publicacion;

    @OneToMany(
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "producto_id")
    private List<Comentario> comentarios;

    @OneToOne(
            fetch = FetchType.EAGER
    )
    private Marca marca;

}
