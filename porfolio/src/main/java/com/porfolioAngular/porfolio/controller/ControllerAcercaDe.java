package com.porfolioAngular.porfolio.controller;

import com.porfolioAngular.porfolio.model.AcercaDe;
import com.porfolioAngular.porfolio.service.IAcercaDeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
        acercaDeServ.crearAcercaDe(acer);
    }

    @PutMapping("/editar/acercaDe")
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
