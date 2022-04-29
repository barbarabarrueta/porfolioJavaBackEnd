package com.porfolioAngular.porfolio.service;

import com.porfolioAngular.porfolio.model.Experiencia;
import com.porfolioAngular.porfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService implements IExperienciaService{
     @Autowired
    public ExperienciaRepository experienciaRepo;

      @Override
    public List<Experiencia> verExperiencia() {
        return experienciaRepo.findAll();
    }
    
    @Override
    public void agregarExperiencia(Experiencia est) {
        experienciaRepo.save(est);
    }
    
    @Override
    public void editarExperiencia(Experiencia est) {
        experienciaRepo.save(est);
    }
    
    @Override
    public void borrarExperiencia(Long id) {
        experienciaRepo.deleteById(id);
    }

   
    @Override
    public Experiencia getOneExperiencia(Long id) {
        return experienciaRepo.findById(id).orElse(null);
    }
    
     public boolean existExperienciaById(Long id){
        return experienciaRepo.existsById(id);
    }
   
    
}
