package com.umg.apirestproyectoDW.controller;

import com.umg.apirestproyectoDW.model.ClientesModel;
import com.umg.apirestproyectoDW.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @Autowired
    private ClientesService clientesService;

    @GetMapping
    public ArrayList<ClientesModel> clientesModels(){
        return this.clientesService.clientesModels();
    }

    @PostMapping
    public ClientesModel saveClientes(@RequestBody ClientesModel clientes){
        return this.clientesService.saveClientes(clientes);
    }

    @GetMapping(path = "/{id}")
    public Optional<ClientesModel> getById(@PathVariable Long id){
        return this.clientesService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public ClientesModel updateClientesById(@RequestBody ClientesModel request, @PathVariable Long id){
        return this.clientesService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.clientesService.deleteClientes(id);

        if (ok){
            return "clintes con "+id+"eliminado";
        }else {
            return "Error, problem al eliminar "+id+"no se puede eliminar";
        }
    }
}
