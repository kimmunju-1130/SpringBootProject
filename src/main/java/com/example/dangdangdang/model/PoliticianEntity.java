package com.example.dangdangdang.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class PoliticianEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long politicianId;
    @Column
    String politicianName;
    LocalDate birth;
    //byte[] imageBytes = Files.readAllBytes(Paths.get("image.png"));
    String career;
    String academiaCareer;
    Long politicalPartId;

    public PoliticianEntity(String politicianName, LocalDate birth, String career, String academiaCareer, Long politicalPartId){
        this.politicianName = politicianName;
        this.birth = birth;
        this.career = career;
        this.academiaCareer = academiaCareer;
        this.politicalPartId = politicalPartId;
    }
}
