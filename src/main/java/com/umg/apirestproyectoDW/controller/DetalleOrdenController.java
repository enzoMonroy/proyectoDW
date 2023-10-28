package com.umg.apirestproyectoDW.controller;

import com.umg.apirestproyectoDW.model.DetalleOrdenModel;
import com.umg.apirestproyectoDW.service.DetalleOrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/detalle_orden")
public class DetalleOrdenController {

    @Autowired
    private DetalleOrdenService detalleOrdenService;


    @GetMapping
    public ArrayList<DetalleOrdenModel> detalleOrdenModels(){
        return this.detalleOrdenService.detalleOrdenModels();
    }

    @PostMapping
    public DetalleOrdenModel saveDetalleOrden(@RequestBody DetalleOrdenModel detalleOrdenModel){
        return this.detalleOrdenService.saveDetalleOrden(detalleOrdenModel);
    }

    @GetMapping(path = "/{id}")
    public Optional<DetalleOrdenModel> getById(@PathVariable Long id){
        return this.detalleOrdenService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public DetalleOrdenModel updateDetalleOrdenById(@RequestBody DetalleOrdenModel request, @PathVariable Long id){
        return this.detalleOrdenService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteeById(@PathVariable("id") Long id){
        boolean ok = this.detalleOrdenService.deleteDetalleOrden(id);

        if (ok){
            return "detalle orden con " +id+ " eliminado!";
        }else {
            return "Error, problem al eliminar "+id+"no se puede eliminar";
        }
    }

}
