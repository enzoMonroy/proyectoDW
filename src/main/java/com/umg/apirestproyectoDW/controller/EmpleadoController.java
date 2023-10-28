package com.umg.apirestproyectoDW.controller;

import com.umg.apirestproyectoDW.model.EmpleadosM;
import com.umg.apirestproyectoDW.service.EmpleadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadosService empleadosService;

    @GetMapping
    public ArrayList<EmpleadosM> empleadosMS(){return this.empleadosService.empleadosMS();}

    @PostMapping
    public EmpleadosM saveEmpleados(@RequestBody EmpleadosM empleadosM){
        return this.empleadosService.saveEmpleados(empleadosM);
    }

    @GetMapping(path = "/{id}")
    public Optional<EmpleadosM> getById(@PathVariable Long id){return this.empleadosService.getById(id);}

    @PutMapping(path = "/{id}")
    public  EmpleadosM updateEmpleadosById(@RequestBody EmpleadosM request, @PathVariable Long id){
        return this.empleadosService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.empleadosService.deleteEmpleados(id);

        if (ok){
            return "empleado con "+id+"eliminado";
        }else {
            return "Error, problem al eliminar "+id+"no se puede eliminar";
        }
    }
}
