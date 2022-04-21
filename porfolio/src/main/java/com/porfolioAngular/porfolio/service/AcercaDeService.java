package com.porfolioAngular.porfolio.service;

import com.porfolioAngular.porfolio.model.AcercaDe;
import com.porfolioAngular.porfolio.repository.AcercaDeRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AcercaDeService implements IAcercaDeService{
    
    @Autowired
    public AcercaDeRepository acercaDeRepo;
    

    @Override
    public List<AcercaDe> verAcercaDe() {
         return acercaDeRepo.findAll();
    }

    @Override
    public void crearAcercaDe(AcercaDe acer) {
         acercaDeRepo.save(acer);
    }

    @Override
    public void editarAcercaDe(AcercaDe acer) {
         acercaDeRepo.save(acer);
    }

    @Override
    public void borrarAcercaDe(Long id) {
         acercaDeRepo.deleteById(id);
    }

    @Override
    public AcercaDe buscarAcercaDe(Long id) {
        return acercaDeRepo.findById(id).orElse(null);
    }
}
