package com.porfolioAngular.porfolio.service;

import java.util.List;
import com.porfolioAngular.porfolio.model.SkillsIdiomas;
import com.porfolioAngular.porfolio.repository.SkillsIdiomasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillsIdiomasService implements ISkillsIdiomasService{
     @Autowired
    public SkillsIdiomasRepository IdiomasRepo;
     
    @Override
    public List<SkillsIdiomas> verSkillsIdiomas() {
         return IdiomasRepo.findAll();
    }

    @Override
    public void agregarSkillsIdiomas(SkillsIdiomas idio) {
         IdiomasRepo.save(idio);
    }

    @Override
    public void editarSkillsIdiomas(SkillsIdiomas idio) {
         IdiomasRepo.save(idio);
    }

    @Override
    public void borrarSkillsIdiomas(Long id) {
         IdiomasRepo.deleteById(id);
    }

    @Override
    public SkillsIdiomas getOneSkillsIdiomas(Long id) {
        return IdiomasRepo.findById(id).orElse(null);
    }
    
    public boolean existSkillsIdiomasById(Long id){
        return IdiomasRepo.existsById(id);
    }
    

    
}
