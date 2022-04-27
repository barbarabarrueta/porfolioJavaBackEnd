package com.porfolioAngular.porfolio.controller;
import com.porfolioAngular.porfolio.dto.MensajeSkillsHabilidades;
import com.porfolioAngular.porfolio.model.SkillsHabilidades;
import com.porfolioAngular.porfolio.service.ISkillsHabilidadesService;
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
public class ControllerSkillsHabilidades {
  @Autowired
    private ISkillsHabilidadesService skillshabserv;
     
     @PostMapping("/new/skillshabilidades")
    public void agregarSkillsHabilidades(@RequestBody SkillsHabilidades hab){
        skillshabserv.agregarSkillsHabilidades(hab);
    }
    
    @GetMapping("/detalle/skillshabilidades/{id}")
    public ResponseEntity<SkillsHabilidades> getOneSkillsProgramas(@PathVariable("id") Long id){
        if(!skillshabserv.existSkillsHabilidadesById(id))
            return new ResponseEntity(new MensajeSkillsHabilidades("no existe"), HttpStatus.NOT_FOUND);
        SkillsHabilidades hab = skillshabserv.getOneSkillsHabilidades(id);
        return new ResponseEntity(hab, HttpStatus.OK);
    }

    @PutMapping("/editar/skillshabilidades/{id}")
    public void editarSkillsHabilidades(@RequestBody SkillsHabilidades hab){
        skillshabserv.editarSkillsHabilidades(hab);
    }
    
    @GetMapping("/ver/skillshabilidades")
    @ResponseBody
    public List<SkillsHabilidades> verSkillsHabilidades(){ 
        return skillshabserv.verSkillsHabilidades();
    }
    
    @DeleteMapping ("/delete/skillshabilidades/{id}")
    public void borrarSkillsHabilidades(@PathVariable Long id){
        skillshabserv.borrarSkillsHabilidades(id);
    }
    
     
    
}
