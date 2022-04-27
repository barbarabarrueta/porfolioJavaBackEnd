package com.porfolioAngular.porfolio.service;

import com.porfolioAngular.porfolio.model.Estudios;
import com.porfolioAngular.porfolio.repository.EstudiosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EstudiosService implements IEstudiosService{
    
    @Autowired
    public EstudiosRepository estudiosRepo;

    @Override
    public List<Estudios> verEstudios() {
        return estudiosRepo.findAll();
    }
    
    @Override
    public void agregarEstudio(Estudios est) {
        estudiosRepo.save(est);
    }
    
    @Override
    public void editarEstudio(Estudios est) {
        estudiosRepo.save(est);
    }
    
    @Override
    public void borrarEstudios(Long id) {
        estudiosRepo.deleteById(id);
    }

   
    @Override
    public Estudios getOneEstudios(Long id) {
        return estudiosRepo.findById(id).orElse(null);
    }
    
     public boolean existEstudioById(Long id){
        return estudiosRepo.existsById(id);
    }
   
}
