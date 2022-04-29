package com.porfolioAngular.porfolio.controller;

import com.porfolioAngular.porfolio.dto.MensajeProyectos;
import com.porfolioAngular.porfolio.model.Proyectos;
import com.porfolioAngular.porfolio.service.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@CrossOrigin(origins = "*")
public class ControllerProyectos {
       
    @Autowired
    private IProyectosService proyectosServ;
     
    @PostMapping("/new/proyectos")
    public void agregarProyectos(@RequestBody Proyectos pro){
        proyectosServ.agregarProyectos(pro);
    }
    
    @GetMapping("/detalle/proyecto/{id}")
    public ResponseEntity<Proyectos> getOneProyectos(@PathVariable("id") Long id){
        if(!proyectosServ.existProyectosById(id))
            return new ResponseEntity(new MensajeProyectos("no existe"), HttpStatus.NOT_FOUND);
        Proyectos pro = proyectosServ.getOneProyectos(id);
        return new ResponseEntity(pro, HttpStatus.OK);
    }

    @PutMapping("/editar/proyecto/{id}")
    public void editarProyectos(@RequestBody Proyectos pro){
        proyectosServ.editarProyectos(pro);
    }
    
    @GetMapping("/ver/proyectos")
    @ResponseBody
    public List<Proyectos> verProyectos(){ 
        return proyectosServ.verProyectos();
    }
    
    @DeleteMapping ("/delete/proyecto/{id}")
    public void borrarProyectos(@PathVariable Long id){
        proyectosServ.borrarProyectos(id);
    }
    
}
