package com.umg.apirestproyectoDW.repository;

import com.umg.apirestproyectoDW.model.OrdenModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrdenRepository extends JpaRepository<OrdenModel, Long> {
}
