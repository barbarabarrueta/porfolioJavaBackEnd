package com.porfolioAngular.porfolio.service;

import com.porfolioAngular.porfolio.model.Estudios;
import java.util.List;


public interface IEstudiosService {
    public List<Estudios> verEstudios();
    public void agregarEstudio (Estudios est);
    public void editarEstudio(Estudios est); 
    public void borrarEstudios (Long id);
    public Estudios getOneEstudios (Long id);
    public boolean existEstudioById(Long id);
    
}
