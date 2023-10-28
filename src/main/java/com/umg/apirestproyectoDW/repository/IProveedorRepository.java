package com.umg.apirestproyectoDW.repository;


import com.umg.apirestproyectoDW.model.ProveedorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProveedorRepository extends JpaRepository<ProveedorModel, Long> {
}
