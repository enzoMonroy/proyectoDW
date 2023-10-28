package com.umg.apirestproyectoDW.controller;

import com.umg.apirestproyectoDW.model.OrdenModel;
import com.umg.apirestproyectoDW.service.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/orden")
public class OrdenController {

    @Autowired
    private OrdenService ordenService;

    @GetMapping
    public ArrayList<OrdenModel> ordenModels(){
        return this.ordenService.ordenModels();
    }

    @PostMapping
    public OrdenModel saveOrden(@RequestBody OrdenModel ordenModel){
        return this.ordenService.saveOrden(ordenModel);
    }

    @GetMapping(path = "/{id}")
    public Optional<OrdenModel> getById(@PathVariable Long id){
        return this.ordenService.getById(id);
    }

    @PostMapping(path = "/{id}")
    public OrdenModel updateOrderById(@RequestBody OrdenModel request, @PathVariable Long id){
        return this.ordenService.updateById(request, id);
    }

    @DeleteMapping (path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.ordenService.deleteOrden(id);

        if (ok){
            return "orden con" +id+ " eliminado!";
        }else {
            return "Error, problem al eliminar "+id+"no se puede eliminar";
        }
    }
}
