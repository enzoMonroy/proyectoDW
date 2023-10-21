package com.umg.apirestproyectoDW.model;

import javax.persistence.*;

@Entity
@Table(name = "Cliente")
public class ClientesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteId;

    @Column
    private String clienteNombre;
    @Column
    private String clienteContactoNombre;

    @Column
    private String clienteDireccion;
    @Column
    private String clienteCiudad;
    @Column
    private String clienteCodigoPostal;
    @Column
    private String clientePais;


    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public String getClienteContactoNombre() {
        return clienteContactoNombre;
    }

    public void setClienteContactoNombre(String clienteContactoNombre) {
        this.clienteContactoNombre = clienteContactoNombre;
    }

    public String getClienteDireccion() {
        return clienteDireccion;
    }

    public void setClienteDireccion(String clienteDireccion) {
        this.clienteDireccion = clienteDireccion;
    }

    public String getClienteCiudad() {
        return clienteCiudad;
    }

    public void setClienteCiudad(String clienteCiudad) {
        this.clienteCiudad = clienteCiudad;
    }

    public String getClienteCodigoPostal() {
        return clienteCodigoPostal;
    }

    public void setClienteCodigoPostal(String clienteCodigoPostal) {
        this.clienteCodigoPostal = clienteCodigoPostal;
    }

    public String getClientePais() {
        return clientePais;
    }

    public void setClientePais(String clientePais) {
        this.clientePais = clientePais;
    }
}
