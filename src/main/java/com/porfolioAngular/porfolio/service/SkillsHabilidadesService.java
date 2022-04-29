package com.porfolioAngular.porfolio.service;

import com.porfolioAngular.porfolio.model.SkillsHabilidades;
import com.porfolioAngular.porfolio.repository.SkillsHabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillsHabilidadesService implements ISkillsHabilidadesService  {
     @Autowired
public SkillsHabilidadesRepository skillshabRepo;
     
    @Override
    public List<SkillsHabilidades> verSkillsHabilidades() {
         return skillshabRepo.findAll();
    }

    @Override
    public void agregarSkillsHabilidades(SkillsHabilidades hab) {
         skillshabRepo.save(hab);
    }

    @Override
    public void editarSkillsHabilidades(SkillsHabilidades hab) {
         skillshabRepo.save(hab);
    }

    @Override
    public void borrarSkillsHabilidades(Long id) {
         skillshabRepo.deleteById(id);
    }

    @Override
    public SkillsHabilidades getOneSkillsHabilidades(Long id) {
        return skillshabRepo.findById(id).orElse(null);
    }
    
    public boolean existSkillsHabilidadesById(Long id){
        return skillshabRepo.existsById(id);
    }
    
}
