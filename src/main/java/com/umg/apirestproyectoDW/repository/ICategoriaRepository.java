package com.umg.apirestproyectoDW.repository;

import com.umg.apirestproyectoDW.model.CategoriaM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriaRepository extends JpaRepository<CategoriaM, Long> {
}
