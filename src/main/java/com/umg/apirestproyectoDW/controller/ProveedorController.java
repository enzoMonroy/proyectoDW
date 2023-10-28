package com.umg.apirestproyectoDW.controller;


import com.umg.apirestproyectoDW.model.ProveedorModel;
import com.umg.apirestproyectoDW.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {
    @Autowired
    private ProveedorService proveedorService;

    @GetMapping
    public ArrayList<ProveedorModel> proveedorModels(){
        return  this.proveedorService.proveedorModels();
    }

    @PostMapping
    public ProveedorModel saveProveedor(@RequestBody ProveedorModel proveedorModel){
        return  this.proveedorService.saveProveedor(proveedorModel);
    }

    @GetMapping(path = "/{id}")
    public Optional<ProveedorModel> getById(@PathVariable Long id){
        return this.proveedorService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public ProveedorModel updateProveedorById(@RequestBody ProveedorModel request, @PathVariable Long id){
        return this.proveedorService.updateById(request, id);
    }

    @DeleteMapping(path ="/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.proveedorService.deleteProveedor(id);

        if (ok){
            return "proveedor con" +id+ " eliminado!";
        }else {
            return "Error, problem al eliminar "+id+"no se puede eliminar";
        }
    }
}
