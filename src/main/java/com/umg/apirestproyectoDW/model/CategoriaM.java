package com.umg.apirestproyectoDW.model;

import javax.persistence.*;

@Entity
@Table(name = "Categoria")
public class CategoriaM {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column
        private String categorias;
        @Column
        private String descripcion;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
