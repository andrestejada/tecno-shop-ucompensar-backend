package com.tecno.shop.ucompensar.tecnoshopucompensar.repositories;

import com.tecno.shop.ucompensar.tecnoshopucompensar.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository  extends JpaRepository<Producto,Integer> {
}
