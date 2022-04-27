package com.porfolioAngular.porfolio.service;

import com.porfolioAngular.porfolio.model.SkillsHabilidades;
import java.util.List;


public interface ISkillsHabilidadesService {
      public List<SkillsHabilidades> verSkillsHabilidades();
    public void agregarSkillsHabilidades(SkillsHabilidades hab);
    public void editarSkillsHabilidades(SkillsHabilidades hab); 
    public void borrarSkillsHabilidades(Long id);
    public SkillsHabilidades getOneSkillsHabilidades (Long id);
    public boolean existSkillsHabilidadesById(Long id);
    
}
