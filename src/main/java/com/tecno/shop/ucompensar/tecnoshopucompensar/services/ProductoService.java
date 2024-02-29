package com.tecno.shop.ucompensar.tecnoshopucompensar.services;

import com.tecno.shop.ucompensar.tecnoshopucompensar.DTOS.ActualizarProductoDTO;
import com.tecno.shop.ucompensar.tecnoshopucompensar.DTOS.CrearProductoDTO;
import com.tecno.shop.ucompensar.tecnoshopucompensar.models.Marca;
import com.tecno.shop.ucompensar.tecnoshopucompensar.models.Producto;
import com.tecno.shop.ucompensar.tecnoshopucompensar.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service()
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;
    public Producto crearProducto(CrearProductoDTO producto){
        Producto productoGuardar = new Producto();
        Marca marca = new Marca();
        marca.setId(producto.marcaId);
        productoGuardar.setTitulo(producto.titulo);
        productoGuardar.setDescripcion(producto.descripcion);
        productoGuardar.setPrecio(producto.precio);
        productoGuardar.setUnidades(producto.unidades);
        productoGuardar.setImagenUrl(producto.imagenUrl);
        productoGuardar.setFecha_publicacion(LocalDateTime.now());
        productoGuardar.setMarca(marca);
        Producto productoGuardado = this.productoRepository.save(productoGuardar);

        return productoGuardado;
    }

    public List<Producto> listarProductos(){
        return this.productoRepository.findAll();
    }

    public void borrarProductoId(Integer productoId){
        this.productoRepository.deleteById(productoId);
    }

    public Producto actualizarProducto( ActualizarProductoDTO productoDTO) {
        Producto productoExistente = this.productoRepository.findById(productoDTO.id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con el ID: " + productoDTO.id));

        if(productoDTO.titulo != null) productoExistente.setTitulo(productoDTO.titulo);
        if(productoDTO.descripcion != null) productoExistente.setDescripcion(productoDTO.descripcion);
        if(productoDTO.precio != null) productoExistente.setPrecio(productoDTO.precio);
        if(productoDTO.unidades != null) productoExistente.setUnidades(productoDTO.unidades);
        if(productoDTO.imagenUrl != null) productoExistente.setImagenUrl(productoDTO.imagenUrl);

        if(productoDTO.marcaId != null) {
            Marca marca = new Marca();
            marca.setId(productoDTO.marcaId);
            productoExistente.setMarca(marca);
        }
        Producto productoActualizado = productoRepository.save(productoExistente);

        return productoActualizado;
    }
}
