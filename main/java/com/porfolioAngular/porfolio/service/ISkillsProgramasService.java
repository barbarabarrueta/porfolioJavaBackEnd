package com.porfolioAngular.porfolio.service;

import com.porfolioAngular.porfolio.model.SkillsProgramas;
import java.util.List;


public interface ISkillsProgramasService {
     public List<SkillsProgramas> verSkillsProgramas();
    public void agregarSkillsProgramas(SkillsProgramas prog);
    public void editarSkillsProgramas(SkillsProgramas prog); 
    public void borrarSkillsProgramas(Long id);
    public SkillsProgramas getOneSkillsProgramas (Long id);
    public boolean existSkillsProgramasById(Long id);
    
    
}
