package com.umg.apirestproyectoDW.controller;

import com.umg.apirestproyectoDW.model.EntregadorModel;
import com.umg.apirestproyectoDW.service.EntregadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/entregador")
public class EntregadorController {

    @Autowired
    private EntregadorService entregadorService;

    @GetMapping
    public ArrayList<EntregadorModel> entregadorModels(){
        return this.entregadorService.entregadorModels();
    }

    @PostMapping
    public EntregadorModel saveEntregador(@RequestBody EntregadorModel entregadorModel){
        return this.entregadorService.saveEntregador(entregadorModel);
    }

    @GetMapping(path = "/{id}")
    public Optional<EntregadorModel> getById(@PathVariable Long id){
        return this.entregadorService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public EntregadorModel updateEntregadorById(@RequestBody EntregadorModel request, @PathVariable Long id){
        return this.entregadorService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.entregadorService.deleteEntregador(id);

        if (ok){
            return "entregador con" +id+ " eliminado!";
        }else {
            return "Error, problem al eliminar "+id+"no se puede eliminar";
        }
    }
}
