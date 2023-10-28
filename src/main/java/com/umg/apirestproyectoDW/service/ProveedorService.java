package com.umg.apirestproyectoDW.service;


import com.umg.apirestproyectoDW.model.ProveedorModel;
import com.umg.apirestproyectoDW.repository.IProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProveedorService {

    @Autowired
    IProveedorRepository proveedorRepository;

    public ArrayList<ProveedorModel> proveedorModels(){
        return (ArrayList<ProveedorModel>) proveedorRepository.findAll();
    }

    public ProveedorModel saveProveedor(ProveedorModel proveedorModel){
        return proveedorRepository.save(proveedorModel);
    }

    public Optional<ProveedorModel>getById(Long id){
        return proveedorRepository.findById(id);
    }

    public ProveedorModel updateById(ProveedorModel request, Long id){
        ProveedorModel proveedorModel = proveedorRepository.findById(id).get();

        proveedorModel.setNombre(request.getNombre());
        proveedorModel.setNombreContacto(request.getNombreContacto());
        proveedorModel.setDireccion(request.getDireccion());
        proveedorModel.setCiudad(request.getCiudad());
        proveedorModel.setCodigoPostal(request.getNombreContacto());
        proveedorModel.setPais(request.getPais());
        proveedorModel.setTel(request.getTel());

        return proveedorModel;
    }

    public Boolean deleteProveedor (Long id){
        try{
            proveedorRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
