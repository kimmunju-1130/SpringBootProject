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
    String academiaCareer; //학력
    Long politicalPartId; //정당
    String electionPrecinct; //선거구
    String NameOfTheAffiliatedCommittee; //소속위원회명
    String politicianEmailAddress; //국회의원이메일주소


    public PoliticianEntity(String politicianName, LocalDate birth, String career, String academiaCareer,
                            Long politicalPartId, String electionPrecinct, String NameOfTheAffiliatedCommittee,
                            String politicianEmailAddress){
        this.politicianName = politicianName;
        this.birth = birth;
        this.career = career;
        this.academiaCareer = academiaCareer;
        this.politicalPartId = politicalPartId;
        this.electionPrecinct = electionPrecinct;
        this.NameOfTheAffiliatedCommittee = NameOfTheAffiliatedCommittee;
        this.politicianEmailAddress = politicianEmailAddress;
    }
}
