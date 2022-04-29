package com.porfolioAngular.porfolio.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
@Entity
public class SkillsIdiomas {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     private String idioma;
      private long porcentaje;
      
      public SkillsIdiomas(){}
      
      public SkillsIdiomas(Long id, String idioma, Long porcentaje){
         this.id = id;
         this.idioma = idioma;
         this.porcentaje = porcentaje;
         
         
    }
    
}
