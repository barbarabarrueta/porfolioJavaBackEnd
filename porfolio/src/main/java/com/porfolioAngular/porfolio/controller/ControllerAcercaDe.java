package com.porfolioAngular.porfolio.controller;

import com.porfolioAngular.porfolio.dto.MensajePersona;
import com.porfolioAngular.porfolio.model.AcercaDe;
import com.porfolioAngular.porfolio.service.IAcercaDeService;
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
public class ControllerAcercaDe {
    
    @Autowired
    private IAcercaDeService acercaDeServ;
     
    @PostMapping("/new/acercaDe")
    public void agregarAcercaDe(@RequestBody AcercaDe acer){
        acercaDeServ.agregarAcercaDe(acer);
    }
    
    @GetMapping("/detalleacercade/{id}")
    public ResponseEntity<AcercaDe> getOnePersona(@PathVariable("id") Long id){
        if(!acercaDeServ.existAcercaDeById(id))
            return new ResponseEntity(new MensajePersona("no existe"), HttpStatus.NOT_FOUND);
        AcercaDe acer = acercaDeServ.getOneAcercaDe(id);
        return new ResponseEntity(acer, HttpStatus.OK);
    }

    @PutMapping("/editar/acercaDe/{id}")
    public void editarAcercaDe(@RequestBody AcercaDe acer){
        acercaDeServ.editarAcercaDe(acer);
    }
    
    @GetMapping("/ver/acercaDe")
    @ResponseBody
    public List<AcercaDe> verAcecaDe(){ 
        return acercaDeServ.verAcercaDe();
    }
    
    @DeleteMapping ("/deleteacercade/{id}")
    public void borrarAcercaDe(@PathVariable Long id){
        acercaDeServ.borrarAcercaDe(id);
    }
    
}
