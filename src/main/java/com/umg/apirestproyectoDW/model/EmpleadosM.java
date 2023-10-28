package com.umg.apirestproyectoDW.model;

import javax.persistence.*;

@Entity
@Table(name = "Empleado")
public class EmpleadosM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long empleadoId;

    @Column
    private String apellido;

    @Column
    private String nombre;
    @Column
    private String fechaCumple;
    @Column
    private String foto;
    @Column
    private String notas;

    public Long getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Long empleadoId) {
        this.empleadoId = empleadoId;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCumple() {
        return fechaCumple;
    }

    public void setFechaCumple(String fechaCumple) {
        this.fechaCumple = fechaCumple;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}
