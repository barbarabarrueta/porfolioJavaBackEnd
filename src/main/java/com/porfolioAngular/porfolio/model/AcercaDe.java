package com.porfolioAngular.porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
@Entity
public class AcercaDe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String acercaDe;
    
    public AcercaDe(){
    }
    
    public AcercaDe(Long id, String acercaDe){  
        this.id=id;
        this.acercaDe=acercaDe; 
    }
      
    
}
