package com.porfolioAngular.porfolio.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Estudios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String school;
    private String img;
    private String title;
    private String career;
    private String start;
    private String end;
    
    public Estudios(){
    }
    
    public Estudios(Long id, String school, String img, String title, 
                    String career, String start, String end){
        
        this.id= id;
        this.school = school;
        this.img = img;
        this.title = title;
        this.career = career;
        this.start = start;
        this.end = end;
    }
    
    
}
