package com.porfolioAngular.porfolio.service;

import com.porfolioAngular.porfolio.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
     public List<Experiencia> verExperiencia();
    public void agregarExperiencia (Experiencia exp);
    public void editarExperiencia(Experiencia exp); 
    public void borrarExperiencia (Long id);
    public Experiencia getOneExperiencia (Long id);
    public boolean existExperienciaById(Long id);
}
