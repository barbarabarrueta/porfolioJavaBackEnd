package com.porfolioAngular.porfolio.controller;


import com.porfolioAngular.porfolio.dto.MensajeEstudios;
import com.porfolioAngular.porfolio.model.Estudios;
import com.porfolioAngular.porfolio.service.EstudiosService;
import com.porfolioAngular.porfolio.service.IEstudiosService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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

public class Controller {
    
    @Autowired
    private IEstudiosService estudiosServ;

    
   
    @PostMapping("/new/estudios")
    public ResponseEntity<?> agregarEstudio(@RequestBody Estudios est){
        estudiosServ.agregarEstudio(est);
        return new ResponseEntity(new MensajeEstudios("estudio creado con exito"), HttpStatus.OK);
         //  listaEstudios.add(est);
    }
    
      @GetMapping("/detalle/{id}")
    public ResponseEntity<Estudios> getOneEstudios(@PathVariable("id") Long id){
        if(!estudiosServ.existEstudioById(id))
            return new ResponseEntity(new MensajeEstudios("no existe"), HttpStatus.NOT_FOUND);
        Estudios est = estudiosServ.getOneEstudios(id);
        return new ResponseEntity(est, HttpStatus.OK);
    }
    
       @PutMapping("/editar/estudios/{id}")
    public ResponseEntity<?> update(@PathVariable("id")Long id, 
            @RequestBody MensajeEstudios mensajeEstudios){
        if(!estudiosServ.existEstudioById(id))
            return new ResponseEntity(new MensajeEstudios("no existe"), HttpStatus.NOT_FOUND);
        
        Estudios est = estudiosServ.getOneEstudios(id);
        id = est.getId();
        est.setId(est.getId());
        est.setSchool(est.getSchool());
        est.setTitle(est.getTitle());
        est.setStart(est.getStart());
        est.setEnd(est.getEnd());
        est.setCareer(est.getCareer());
        est.setImg(est.getImg());
        
        estudiosServ.editarEstudio(est);
        return new ResponseEntity(new MensajeEstudios("producto actualizado"), HttpStatus.OK);
    }   
    
    @GetMapping("/ver/estudios")
    @ResponseBody
    public List<Estudios> verEstudios(){
        return estudiosServ.verEstudios();
      
    }
    
 
    @DeleteMapping ("/delete/{id}")
    public void borrarEstudios (@PathVariable Long id){
        estudiosServ.borrarEstudios(id);
    }
    
    
}
