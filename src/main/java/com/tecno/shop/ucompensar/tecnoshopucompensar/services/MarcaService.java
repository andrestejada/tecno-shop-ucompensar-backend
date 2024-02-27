package com.tecno.shop.ucompensar.tecnoshopucompensar.services;

import com.tecno.shop.ucompensar.tecnoshopucompensar.models.Marca;
import com.tecno.shop.ucompensar.tecnoshopucompensar.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService {
    @Autowired
    MarcaRepository marcaRepository;


    public Marca crearMarca(Marca marca){
         return this.marcaRepository.save(marca);
    }

    public List<Marca>listarMarcas(){
        return this.marcaRepository.findAll();
    }
}
