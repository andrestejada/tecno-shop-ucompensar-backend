package com.tecno.shop.ucompensar.tecnoshopucompensar.services;

import com.tecno.shop.ucompensar.tecnoshopucompensar.DTOS.CrearProductoDTO;
import com.tecno.shop.ucompensar.tecnoshopucompensar.models.Producto;
import com.tecno.shop.ucompensar.tecnoshopucompensar.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service()
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;
    public Producto crearProducto(CrearProductoDTO producto){
        Producto productoGuardar = new Producto();
        productoGuardar.setTitulo(producto.titulo);
        productoGuardar.setDescripcion(producto.descripcion);
        productoGuardar.setPrecio(producto.precio);
        productoGuardar.setUnidades(producto.unidades);
        productoGuardar.setImagenUrl(producto.imagenUrl);
        productoGuardar.setFecha_publicacion(new Date());
        Producto productoGuardado = this.productoRepository.save(productoGuardar);

        return productoGuardado;
    }
}
