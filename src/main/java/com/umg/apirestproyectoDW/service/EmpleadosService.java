package com.umg.apirestproyectoDW.service;

import com.umg.apirestproyectoDW.model.EmpleadosM;
import com.umg.apirestproyectoDW.repository.IEmpleadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmpleadosService {

    @Autowired
    IEmpleadosRepository empleadosRepository;

    public ArrayList<EmpleadosM>empleadosMS(){return (ArrayList<EmpleadosM>) empleadosRepository.findAll(); }

    public EmpleadosM saveEmpleados(EmpleadosM empleadosM) {return empleadosRepository.save(empleadosM);}

    public Optional<EmpleadosM> getById(Long id) {return empleadosRepository.findById(id);}

    public EmpleadosM updateById(EmpleadosM request, Long id){
        EmpleadosM empleadosM = empleadosRepository.findById(id).get();

        empleadosM.setApellido(request.getApellido());
        empleadosM.setNombre(request.getNombre());
        empleadosM.setFechaCumple(request.getFechaCumple());
        empleadosM.setFoto(empleadosM.getFoto());
        empleadosM.setNotas(empleadosM.getNotas());
        empleadosRepository.save(empleadosM);

        return empleadosM;
    }

    public  Boolean deleteEmpleados (Long id){
        try {
            empleadosRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
