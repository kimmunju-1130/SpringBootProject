package com.example.dangdangdang.model;

import java.time.LocalDate;

public class PoliticianRequestDto {
    Long politicianId;
    String politicianName;
    LocalDate birth;
    //byte[] imageBytes = Files.readAllBytes(Paths.get("image.png"));
    String career;
    String academiaCareer;
    Long politicalPartId;
    String electionPrecinct; //선거구
    String NameOfTheAffiliatedCommittee; //소속위원회명
    String politicianEmailAddress; //국회의원이메일주소

    public PoliticianEntity PoliticianToEntity(){
        return new PoliticianEntity(this.politicianName,this.birth,this.career,this.academiaCareer,
                this.politicalPartId,this.electionPrecinct,this.NameOfTheAffiliatedCommittee,
                this.politicianEmailAddress);
    }
}
