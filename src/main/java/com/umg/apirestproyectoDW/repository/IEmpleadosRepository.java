package com.umg.apirestproyectoDW.repository;

import com.umg.apirestproyectoDW.model.EmpleadosM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadosRepository extends JpaRepository<EmpleadosM, Long> {
}
