package com.porfolioAngular.porfolio.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
@Entity
public class SkillsHabilidades {
      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      private Long id;
      private String habilidades;
      private long porcentaje;
      
      public SkillsHabilidades(){}
      
      public SkillsHabilidades(Long id, String habilidades, Long porcentaje){
         this.id = id;
         this.habilidades = habilidades;
         this.porcentaje = porcentaje;
         
         
    }
    
}
