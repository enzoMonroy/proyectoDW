package com.umg.apirestproyectoDW.service;


import com.umg.apirestproyectoDW.model.DetalleOrdenModel;
import com.umg.apirestproyectoDW.repository.IDetalleOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DetalleOrdenService {

    @Autowired
    IDetalleOrdenRepository detalleOrdenRepository;

    public ArrayList<DetalleOrdenModel> detalleOrdenModels(){
        return (ArrayList<DetalleOrdenModel>) detalleOrdenRepository.findAll();
    }

    public DetalleOrdenModel saveDetalleOrden(DetalleOrdenModel detalleOrdenModel){
        return detalleOrdenRepository.save(detalleOrdenModel);
    }

    public Optional<DetalleOrdenModel>getById(Long id){
        return detalleOrdenRepository.findById(id);
    }

    public DetalleOrdenModel updateById(DetalleOrdenModel request, Long id){
        DetalleOrdenModel detalleOrdenModel = detalleOrdenRepository.findById(id).get();

        detalleOrdenModel.setOrderId(request.getOrderId());
        detalleOrdenModel.setProductoId(request.getProductoId());
        detalleOrdenModel.setCantidad(request.getCantidad());

        return detalleOrdenModel;
    }

    public Boolean deleteDetalleOrden(Long id){
        try {
            detalleOrdenRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
