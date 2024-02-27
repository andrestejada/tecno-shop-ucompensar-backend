package com.tecno.shop.ucompensar.tecnoshopucompensar.repositories;

import com.tecno.shop.ucompensar.tecnoshopucompensar.models.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca,Integer> {
}
