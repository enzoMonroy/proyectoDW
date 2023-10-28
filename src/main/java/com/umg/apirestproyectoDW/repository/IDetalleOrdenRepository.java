package com.umg.apirestproyectoDW.repository;

import com.umg.apirestproyectoDW.model.DetalleOrdenModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleOrdenRepository extends JpaRepository<DetalleOrdenModel, Long> {
}
