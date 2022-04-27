package com.porfolioAngular.porfolio.controller;

import com.porfolioAngular.porfolio.dto.MensajeSkillsIdiomas;
import com.porfolioAngular.porfolio.model.SkillsIdiomas;
import com.porfolioAngular.porfolio.service.ISkillsIdiomasService;
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
public class ControllerSkillsIdiomas {
     @Autowired
    private ISkillsIdiomasService skillsprogserv;
     
     @PostMapping("/new/skillsidiomas")
    public void agregarSkillsIdiomas(@RequestBody SkillsIdiomas idio){
        skillsprogserv.agregarSkillsIdiomas(idio);
    }
    
    @GetMapping("/detalle/skillsidiomas/{id}")
    public ResponseEntity<SkillsIdiomas> getOneSkillsIdiomas(@PathVariable("id") Long id){
        if(!skillsprogserv.existSkillsIdiomasById(id))
            return new ResponseEntity(new MensajeSkillsIdiomas("no existe"), HttpStatus.NOT_FOUND);
        SkillsIdiomas idio = skillsprogserv.getOneSkillsIdiomas(id);
        return new ResponseEntity(idio, HttpStatus.OK);
    }

    @PutMapping("/editar/skillsidiomas/{id}")
    public void editarSkillsIdiomas(@RequestBody SkillsIdiomas idio){
        skillsprogserv.editarSkillsIdiomas(idio);
    }
    
    @GetMapping("/ver/skillsidiomas")
    @ResponseBody
    public List<SkillsIdiomas> verSkillsIdiomas(){ 
        return skillsprogserv.verSkillsIdiomas();
    }
    
    @DeleteMapping ("/delete/skillsidiomas/{id}")
    public void borrarSkillsIdiomas(@PathVariable Long id){
        skillsprogserv.borrarSkillsIdiomas(id);
    }
    
    
}
