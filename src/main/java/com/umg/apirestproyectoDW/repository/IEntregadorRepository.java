package com.umg.apirestproyectoDW.repository;

import com.umg.apirestproyectoDW.model.EntregadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEntregadorRepository extends JpaRepository<EntregadorModel, Long> {
}
