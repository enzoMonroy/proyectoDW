package com.umg.apirestproyectoDW.service;

import com.umg.apirestproyectoDW.model.ClientesModel;
import com.umg.apirestproyectoDW.repository.IClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClientesService {

    @Autowired
    IClientesRepository clientesRepository;

    public ArrayList<ClientesModel>clientesModels(){
        return (ArrayList<ClientesModel>) clientesRepository.findAll();
    }

    public ClientesModel saveClientes(ClientesModel clientes){
        return  clientesRepository.save(clientes);
    }

    public Optional<ClientesModel> getById(Long id){
        return clientesRepository.findById(id);
    }

    public ClientesModel updateById(ClientesModel request, Long id){
        ClientesModel clientes = clientesRepository.findById(id).get();

        clientes.setClienteNombre(request.getClienteNombre());
        clientes.setClienteContactoNombre(request.getClienteContactoNombre());
        clientes.setClienteDireccion(request.getClienteDireccion());
        clientes.setClienteCiudad(request.getClienteCiudad());
        clientes.setClienteCodigoPostal(request.getClienteCodigoPostal());
        clientes.setClientePais(request.getClientePais());
        clientesRepository.save(clientes);

        return clientes;
    }

    public Boolean deleteClientes (Long id){
        try {
            clientesRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
