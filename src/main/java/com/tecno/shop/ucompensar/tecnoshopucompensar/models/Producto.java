package com.tecno.shop.ucompensar.tecnoshopucompensar.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String imagenUrl;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private Float precio;

    @Column(nullable = false)
    private Integer unidades;

    @Column(nullable = false)
    private LocalDateTime fecha_publicacion;

    @OneToMany
    @JoinColumn(name = "producto_id")
    private List<Comentario> comentarios;

    @ManyToOne(fetch = FetchType.EAGER)
    private Marca marca;

   /* @Column(nullable = false)
    private Integer usuario_id;*/

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;



}
