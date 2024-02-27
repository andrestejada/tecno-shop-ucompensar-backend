package com.tecno.shop.ucompensar.tecnoshopucompensar.DTOS;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CrearProductoDTO {
    public String titulo;
    public String imagenUrl;
    public String descripcion;
    public String precio;
    public Integer unidades;
}
