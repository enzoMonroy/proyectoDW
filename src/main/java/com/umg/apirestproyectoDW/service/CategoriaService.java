package com.umg.apirestproyectoDW.service;

import com.umg.apirestproyectoDW.model.CategoriaM;
import com.umg.apirestproyectoDW.repository.ICategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    ICategoriaRepository categoriaRepository;

    public ArrayList<CategoriaM> categoriaM(){
        return (ArrayList<CategoriaM>) categoriaRepository.findAll();
    }

    public CategoriaM saveCategoria(CategoriaM categoria){
        return categoriaRepository.save(categoria);
    }

    //obtener categoria por medio de ID
    public Optional<CategoriaM> getById(Long id){
        return categoriaRepository.findById(id);
    }

    public CategoriaM updateById(CategoriaM request, Long id){
        CategoriaM categoria = categoriaRepository.findById(id).get();

        categoria.setCategorias(request.getCategorias());
        categoria.setDescripcion((request.getDescripcion()));
        categoriaRepository.save(categoria);

        return categoria;
    }

    public Boolean deleteCategoria (Long id){
        try {
            categoriaRepository.deleteById(id);
            return true;

        }catch (Exception e){
            return false;
        }
    }
}
