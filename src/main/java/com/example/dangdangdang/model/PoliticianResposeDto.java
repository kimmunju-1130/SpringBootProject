package com.example.dangdangdang.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class PoliticianResposeDto {
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

    public PoliticianResposeDto fromPoliticianEntity(PoliticianEntity politician){
        PoliticianResposeDto politicianResposeDto = new PoliticianResposeDto();
        politicianResposeDto.politicianId = politician.getPoliticianId();
        politicianResposeDto.politicianName = politician.getPoliticianName();
        politicianResposeDto.birth = politician.getBirth();
        politicianResposeDto.career = politician.getCareer();
        politicianResposeDto.academiaCareer = politician.getAcademiaCareer();
        politicianResposeDto.politicalPartId = politician.getPoliticalPartId();
        politicianResposeDto.electionPrecinct = politician.getElectionPrecinct();
        politicianResposeDto.NameOfTheAffiliatedCommittee = politician.getNameOfTheAffiliatedCommittee();
        politicianResposeDto.politicianEmailAddress = politician.getPoliticianEmailAddress();
        return  politicianResposeDto;
    }
}
