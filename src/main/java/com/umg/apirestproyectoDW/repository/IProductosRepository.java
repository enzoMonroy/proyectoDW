package com.umg.apirestproyectoDW.repository;

import com.umg.apirestproyectoDW.model.ProductosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductosRepository extends JpaRepository<ProductosModel, Long> {
}
