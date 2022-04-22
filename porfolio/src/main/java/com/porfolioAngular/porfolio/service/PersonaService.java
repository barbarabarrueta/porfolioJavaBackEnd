package com.porfolioAngular.porfolio.service;

import com.porfolioAngular.porfolio.model.Persona;
import com.porfolioAngular.porfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersona() {
        return persoRepo.findAll();
    }

    @Override
    public void agregarPersona(Persona per) {
         persoRepo.save(per);
    }
    
    @Override
    public void editarPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
     persoRepo.deleteById(id);
    }

    @Override
    public Persona getOnePersona(Long id) {
    return persoRepo.findById(id).orElse(null);
    }
    
     public boolean existPersonaById(Long id){
        return persoRepo.existsById(id);
    }
   
    
}
