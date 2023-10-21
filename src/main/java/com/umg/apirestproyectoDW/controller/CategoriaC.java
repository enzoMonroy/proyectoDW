package com.umg.apirestproyectoDW.controller;

import com.umg.apirestproyectoDW.model.CategoriaM;
import com.umg.apirestproyectoDW.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")

public class CategoriaC {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public ArrayList<CategoriaM> categoriaM(){
        return this.categoriaService.categoriaM();
    }

    @PostMapping
    public CategoriaM saveCategoria(@RequestBody CategoriaM categoria){
        return this.categoriaService.saveCategoria(categoria);
    }

    @GetMapping(path = "/{id}")
    public Optional<CategoriaM> getById(@PathVariable Long id){
        return this.categoriaService.getById(id);
    }


    @PutMapping(path = "/{id}")
    public CategoriaM updateUserById(@RequestBody CategoriaM request,@PathVariable Long id){
        return this.categoriaService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.categoriaService.deleteCategoria(id);

        if (ok){
            return "categoria con" +id+ " eliminado!";
        }else {
            return "Error, problem al eliminar "+id+"no se puede eliminar";
        }
    }


}
