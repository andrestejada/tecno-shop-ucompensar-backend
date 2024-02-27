package com.tecno.shop.ucompensar.tecnoshopucompensar.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Marca {
    @Id
    @GeneratedValue
    private Integer id;

    private String nombre;
}
