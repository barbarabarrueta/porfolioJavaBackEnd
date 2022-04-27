package com.porfolioAngular.porfolio.service;

import com.porfolioAngular.porfolio.model.SkillsProgramas;
import com.porfolioAngular.porfolio.repository.SkillsProgramasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillsProgramasService implements ISkillsProgramasService {
     @Autowired
    public SkillsProgramasRepository skillsprogRepo;
     
    @Override
    public List<SkillsProgramas> verSkillsProgramas() {
         return skillsprogRepo.findAll();
    }

    @Override
    public void agregarSkillsProgramas(SkillsProgramas prog) {
         skillsprogRepo.save(prog);
    }

    @Override
    public void editarSkillsProgramas(SkillsProgramas prog) {
         skillsprogRepo.save(prog);
    }

    @Override
    public void borrarSkillsProgramas(Long id) {
         skillsprogRepo.deleteById(id);
    }

    @Override
    public SkillsProgramas getOneSkillsProgramas(Long id) {
        return skillsprogRepo.findById(id).orElse(null);
    }
    
    public boolean existSkillsProgramasById(Long id){
        return skillsprogRepo.existsById(id);
    }
    
}
