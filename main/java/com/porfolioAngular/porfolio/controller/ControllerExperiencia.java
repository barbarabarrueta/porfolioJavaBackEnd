
package com.porfolioAngular.porfolio.controller;

import com.porfolioAngular.porfolio.dto.MensajeExperiencia;
import com.porfolioAngular.porfolio.model.Experiencia;
import com.porfolioAngular.porfolio.service.IExperienciaService;
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

public class ControllerExperiencia {
    
    @Autowired
    private IExperienciaService experienciaServ;
    
     @PostMapping("/new/experiencia")
    public ResponseEntity<?> agregarExperiencia(@RequestBody Experiencia exp){
        experienciaServ.agregarExperiencia(exp);
        return new ResponseEntity(new MensajeExperiencia("experiencia creada con exito"), HttpStatus.OK);
    }
    
    @GetMapping("/detalle/experiencia/{id}")
    public ResponseEntity<Experiencia> getOneExperiencia(@PathVariable("id") Long id){
        if(!experienciaServ.existExperienciaById(id))
            return new ResponseEntity(new MensajeExperiencia("no existe"), HttpStatus.NOT_FOUND);
        Experiencia exp = experienciaServ.getOneExperiencia(id);
        return new ResponseEntity(exp, HttpStatus.OK);
    }
    
      @PutMapping("/editar/experiencia/{id}")
    public ResponseEntity<?> editarExperiencia(@RequestBody Experiencia exp){
        experienciaServ.editarExperiencia(exp);
        return new ResponseEntity(new MensajeExperiencia("experiencia editada con exito"), HttpStatus.OK);
    }
    
    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia(){
        return experienciaServ.verExperiencia();
    }
    
 
    @DeleteMapping ("/delete/experiencia/{id}")
    public void borrarExperiencia (@PathVariable Long id){
        experienciaServ.borrarExperiencia(id);
    }
    
    
}
