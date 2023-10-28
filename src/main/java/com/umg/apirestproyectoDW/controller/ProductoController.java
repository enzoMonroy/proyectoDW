package com.umg.apirestproyectoDW.controller;

import com.umg.apirestproyectoDW.model.ProductosModel;
import com.umg.apirestproyectoDW.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductosService productosService;

    @GetMapping
    public ArrayList<ProductosModel> productosModels(){
        return this.productosService.productosModels();
    }

    @PostMapping
    public ProductosModel saveProducto(@RequestBody ProductosModel productosModel){
        return this.productosService.saveProducto(productosModel);
    }

    @GetMapping(path = "/{id}")
    public Optional<ProductosModel> getById(@PathVariable Long id){
        return this.productosService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public ProductosModel updateProductoById(@RequestBody ProductosModel request, @PathVariable Long id){
        return this.productosService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.productosService.deleteProducto(id);

        if (ok){
            return "producto con" +id+ " eliminado!";
        }else {
            return "Error, problem al eliminar "+id+"no se puede eliminar";
        }
    }
}
