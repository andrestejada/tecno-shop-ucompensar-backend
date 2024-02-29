package com.tecno.shop.ucompensar.tecnoshopucompensar.controllers;


import com.tecno.shop.ucompensar.tecnoshopucompensar.models.Marca;
import com.tecno.shop.ucompensar.tecnoshopucompensar.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/marca")
public class MarcaController {
    @Autowired
    MarcaService marcaService;

    @PostMapping
     Marca crearMarca(@RequestBody Marca marca){
        return this.marcaService.crearMarca(marca);
    }

    @GetMapping
    List<Marca> listarMarcas() {
        return this.marcaService.listarMarcas();
    }
}
