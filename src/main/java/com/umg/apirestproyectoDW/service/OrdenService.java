package com.umg.apirestproyectoDW.service;

import com.umg.apirestproyectoDW.model.OrdenModel;
import com.umg.apirestproyectoDW.repository.IOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class OrdenService {

    @Autowired
    IOrdenRepository ordenRepository;

    public ArrayList<OrdenModel> ordenModels(){
        return (ArrayList<OrdenModel>) ordenRepository.findAll();
    }

    public OrdenModel saveOrden(OrdenModel ordenModel){
        return ordenRepository.save(ordenModel);
    }

    public Optional<OrdenModel>getById(Long id){
        return ordenRepository.findById(id);
    }

    public OrdenModel updateById(OrdenModel request, Long id){
        OrdenModel ordenModel= ordenRepository.findById(id).get();

        ordenModel.setClienteId(request.getClienteId());
        ordenModel.setEmpleadoId(request.getEmpleadoId());
        ordenModel.setFechaOrden(request.getFechaOrden());
        ordenModel.setEntregadorId(request.getEntregadorId());

        return ordenModel;
    }

    public Boolean deleteOrden (Long id){
        try {
            ordenRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
