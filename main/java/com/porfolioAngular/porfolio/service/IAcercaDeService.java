package com.porfolioAngular.porfolio.service;

import com.porfolioAngular.porfolio.model.AcercaDe;
import java.util.List;


public interface IAcercaDeService {
    
    public List<AcercaDe> verAcercaDe();
    public void agregarAcercaDe(AcercaDe acer);
    public void editarAcercaDe(AcercaDe acer); 
    public void borrarAcercaDe(Long id);
    public AcercaDe getOneAcercaDe (Long id);
    public boolean existAcercaDeById(Long id);
    
}
