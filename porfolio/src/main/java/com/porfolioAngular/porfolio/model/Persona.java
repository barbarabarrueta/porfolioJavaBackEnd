package com.porfolioAngular.porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
@Entity
public class Persona {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     private String nombre;
     private String apellido; 
     private String ubicacion;
     private String img;
     
     public Persona() {
     }
     
     public Persona(Long id, String nombre, String apellido, String ubicacion, String img){
         this.id=id;
         this.nombre=nombre;
         this.apellido=apellido;
         this.ubicacion=ubicacion;
         this.img=img;
     }
}
