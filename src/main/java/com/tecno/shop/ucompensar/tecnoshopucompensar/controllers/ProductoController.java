package com.tecno.shop.ucompensar.tecnoshopucompensar.controllers;
import com.tecno.shop.ucompensar.tecnoshopucompensar.DTOS.CrearProductoDTO;
import com.tecno.shop.ucompensar.tecnoshopucompensar.models.Producto;
import com.tecno.shop.ucompensar.tecnoshopucompensar.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    ProductoService productoService;
    @PostMapping
    Producto crearProducto( @RequestBody CrearProductoDTO producto){
        return this.productoService.crearProducto(producto);
    }

    @GetMapping
    List<Producto> listarProductos(){
        return this.productoService.listarProductos();
    }

    @DeleteMapping("/{id}")
    void borrarProductoId( @PathVariable("id") Integer productoId){
        this.productoService.borrarProductoId(productoId);
    }
}
