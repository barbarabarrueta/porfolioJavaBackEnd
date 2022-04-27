package com.porfolioAngular.porfolio.service;

import com.porfolioAngular.porfolio.model.Proyectos;
import com.porfolioAngular.porfolio.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectosService implements IProyectosService {
    
     @Autowired
    public ProyectosRepository proyectosRepo;
     
        @Override
    public List<Proyectos> verProyectos() {
         return proyectosRepo.findAll();
    }

    @Override
    public void agregarProyectos(Proyectos pro) {
         proyectosRepo.save(pro);
    }

    @Override
    public void editarProyectos(Proyectos pro) {
         proyectosRepo.save(pro);
    }

    @Override
    public void borrarProyectos(Long id) {
         proyectosRepo.deleteById(id);
    }

    @Override
    public Proyectos getOneProyectos(Long id) {
        return proyectosRepo.findById(id).orElse(null);
    }
    
    public boolean existProyectosById(Long id){
        return proyectosRepo.existsById(id);
    }
    

    
}
