package com.porfolioAngular.porfolio.service;

import com.porfolioAngular.porfolio.model.SkillsIdiomas;
import java.util.List;

public interface ISkillsIdiomasService {
    public List<SkillsIdiomas> verSkillsIdiomas();
    public void agregarSkillsIdiomas(SkillsIdiomas idio);
    public void editarSkillsIdiomas(SkillsIdiomas idio); 
    public void borrarSkillsIdiomas(Long id);
    public SkillsIdiomas getOneSkillsIdiomas(Long id);
    public boolean existSkillsIdiomasById(Long id);
    
}
