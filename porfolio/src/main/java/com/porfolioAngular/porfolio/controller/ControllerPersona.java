package com.porfolioAngular.porfolio.controller;

import com.porfolioAngular.porfolio.dto.MensajePersona;
import com.porfolioAngular.porfolio.model.Persona;
import com.porfolioAngular.porfolio.service.IPersonaService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
public class ControllerPersona {
    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){
        persoServ.agregarPersona(pers);
        // listaPersonas.add(pers);
    }
    
     @GetMapping("/detallepersona/{id}")
    public ResponseEntity<Persona> getOnePersona(@PathVariable("id") Long id){
        if(!persoServ.existPersonaById(id))
            return new ResponseEntity(new MensajePersona("no existe"), HttpStatus.NOT_FOUND);
        Persona per = persoServ.getOnePersona(id);
        return new ResponseEntity(per, HttpStatus.OK);
    }
    
    @PutMapping("/editar/persona/{id}")
    public void editarPersona(@RequestBody Persona pers){
        persoServ.editarPersona(pers);
         
    }
    
    @GetMapping("/ver/persona")
    @ResponseBody
    public List<Persona> verPersona(){ 
        return persoServ.verPersona();
     
    }
    
    @DeleteMapping ("/deletepersona/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
}
