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
public class Marca {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String nombre;
}
