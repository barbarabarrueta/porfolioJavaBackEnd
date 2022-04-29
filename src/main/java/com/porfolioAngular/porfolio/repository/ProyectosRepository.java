package com.porfolioAngular.porfolio.repository;

import com.porfolioAngular.porfolio.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectosRepository extends JpaRepository <Proyectos, Long> {
    
}
