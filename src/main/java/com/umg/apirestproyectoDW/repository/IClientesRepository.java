package com.umg.apirestproyectoDW.repository;

import com.umg.apirestproyectoDW.model.ClientesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientesRepository extends JpaRepository<ClientesModel, Long> {
}
