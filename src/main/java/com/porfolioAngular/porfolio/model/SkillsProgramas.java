package com.porfolioAngular.porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class SkillsProgramas {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String programa;
    private long porcentaje;
    
    
    public SkillsProgramas(){
    }
    
     public SkillsProgramas( Long id, String programa, Long porcentaje){
         this.id = id;
         this.programa = programa;
         this.porcentaje = porcentaje;
         
         
    }
}
