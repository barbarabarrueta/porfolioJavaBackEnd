package com.porfolioAngular.porfolio.service;

import com.porfolioAngular.porfolio.model.Proyectos;
import java.util.List;


public interface IProyectosService {
     public List<Proyectos> verProyectos();
    public void agregarProyectos(Proyectos pro);
    public void editarProyectos(Proyectos pro); 
    public void borrarProyectos(Long id);
    public Proyectos getOneProyectos (Long id);
    public boolean existProyectosById(Long id);
    
    
}
