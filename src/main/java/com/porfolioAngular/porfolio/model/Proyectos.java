package com.porfolioAngular.porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String link;
    private String descripcion;
    
    public Proyectos(){
    }
    
     public Proyectos( Long id, String titulo, String link, String descripcion){
         this.id = id;
         this.titulo = titulo;
         this.link = link;
         this.descripcion = descripcion;
         
    }
    
}
