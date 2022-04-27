package com.porfolioAngular.porfolio.controller;

import com.porfolioAngular.porfolio.dto.MensajeSkillsProgramas;
import com.porfolioAngular.porfolio.model.SkillsProgramas;
import com.porfolioAngular.porfolio.service.ISkillsProgramasService;
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
public class ControllerSkillsProgramas {
     @Autowired
    private ISkillsProgramasService skillsprogserv;
     
     @PostMapping("/new/skillsprogramas")
    public void agregarSkillsProgramas(@RequestBody SkillsProgramas prog){
        skillsprogserv.agregarSkillsProgramas(prog);
    }
    
    @GetMapping("/detalle/skillsprogramas/{id}")
    public ResponseEntity<SkillsProgramas> getOneProyectos(@PathVariable("id") Long id){
        if(!skillsprogserv.existSkillsProgramasById(id))
            return new ResponseEntity(new MensajeSkillsProgramas("no existe"), HttpStatus.NOT_FOUND);
        SkillsProgramas prog = skillsprogserv.getOneSkillsProgramas(id);
        return new ResponseEntity(prog, HttpStatus.OK);
    }

    @PutMapping("/editar/skillsprogramas/{id}")
    public void editarSkillsProgramas(@RequestBody SkillsProgramas prog){
        skillsprogserv.editarSkillsProgramas(prog);
    }
    
    @GetMapping("/ver/skillsprogramas")
    @ResponseBody
    public List<SkillsProgramas> verSkillsProgramas(){ 
        return skillsprogserv.verSkillsProgramas();
    }
    
    @DeleteMapping ("/delete/skillsprogramas/{id}")
    public void borrarSkillsProgramas(@PathVariable Long id){
        skillsprogserv.borrarSkillsProgramas(id);
    }
    
     
    
}
