package com.umg.apirestproyectoDW.service;

import com.umg.apirestproyectoDW.model.ProductosModel;
import com.umg.apirestproyectoDW.repository.IProductosRepository;
import com.umg.apirestproyectoDW.repository.IProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductosService {

    @Autowired
    IProductosRepository productosRepository;

    public ArrayList<ProductosModel> productosModels(){
        return (ArrayList<ProductosModel>) productosRepository.findAll();
    }

    public ProductosModel saveProducto(ProductosModel productosModel){
        return productosRepository.save(productosModel);
    }

    public Optional<ProductosModel>getById (Long id){
        return productosRepository.findById(id);
    }

    public ProductosModel updateById(ProductosModel request, Long id){
        ProductosModel productosModel= productosRepository.findById(id).get();

        productosModel.setNombre(request.getNombre());
        productosModel.setProveedorId(request.getProveedorId());
        productosModel.setCategoriaId(request.getCategoriaId());
        productosModel.setUnidad(request.getUnidad());
        productosModel.setPrecio(request.getPrecio());

        return productosModel;
    }

    public Boolean deleteProducto (Long id){
        try {
            productosRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
