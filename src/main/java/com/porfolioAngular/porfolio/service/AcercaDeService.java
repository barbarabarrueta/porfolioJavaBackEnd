package com.porfolioAngular.porfolio.service;

import com.porfolioAngular.porfolio.model.AcercaDe;
import com.porfolioAngular.porfolio.repository.AcercaDeRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AcercaDeService implements IAcercaDeService{
    
    @Autowired
    public AcercaDeRepository acercaDeRepo;
    

    @Override
    public List<AcercaDe> verAcercaDe() {
         return acercaDeRepo.findAll();
    }

    @Override
    public void agregarAcercaDe(AcercaDe acer) {
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
    public AcercaDe getOneAcercaDe(Long id) {
        return acercaDeRepo.findById(id).orElse(null);
    }
    
    public boolean existAcercaDeById(Long id){
        return acercaDeRepo.existsById(id);
    }
}
