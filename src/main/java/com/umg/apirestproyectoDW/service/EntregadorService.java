package com.umg.apirestproyectoDW.service;

import com.umg.apirestproyectoDW.model.EntregadorModel;
import com.umg.apirestproyectoDW.repository.IEntregadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EntregadorService {

    @Autowired
    IEntregadorRepository entregadorRepository;

    public ArrayList<EntregadorModel> entregadorModels(){
        return (ArrayList<EntregadorModel>) entregadorRepository.findAll();
    }

    public EntregadorModel saveEntregador(EntregadorModel entregadorModel){
        return entregadorRepository.save(entregadorModel);
    }

    public Optional<EntregadorModel> getById(Long id){
        return entregadorRepository.findById(id);
    }

    public EntregadorModel updateById(EntregadorModel request, Long id){
        EntregadorModel entregadorModel = entregadorRepository.findById(id).get();

        entregadorModel.setNombre(request.getNombre());
        entregadorModel.setTel(request.getTel());
        entregadorRepository.save(entregadorModel);

        return entregadorModel;
    }

    public Boolean deleteEntregador (Long id){
        try {
            entregadorRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
