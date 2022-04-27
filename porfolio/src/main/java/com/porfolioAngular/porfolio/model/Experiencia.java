package com.porfolioAngular.porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     private String empresa;
     private String puesto;
     private String descripcion;
     
     public Experiencia(){}
     
     public Experiencia(Long id, String empresa, String puesto, String descripcion){
        this.id= id;
        this.empresa = empresa;
        this.puesto = puesto;
        this.descripcion = descripcion;
     }
    
    
}
