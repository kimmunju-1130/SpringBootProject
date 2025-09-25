package com.example.dangdangdang.service;

import com.example.dangdangdang.model.PoliticalPartyEntity;
import com.example.dangdangdang.model.PoliticianEntity;
import com.example.dangdangdang.model.PoliticianRequestDto;
import com.example.dangdangdang.repository.PoliticianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PoliticianService {
    @Autowired
    public PoliticianRepository politicianRepository;

    //정치인 추가
    public void addPolitician(PoliticianRequestDto politicianRequestDto){
        PoliticianEntity add = politicianRequestDto.PoliticianToEntity();
        PoliticianEntity added = politicianRepository.save(add);
    }
    //정치인 찾기
    public Optional<PoliticianEntity> filterByPoliticianName(String politicianName){
        Optional<PoliticianEntity> filterList = politicianRepository.findByPoliticianNameContaining(politicianName);
        if(filterList.isPresent()){
            return filterList;
        }
        throw new IllegalArgumentException("해당 정치인이 없습니다.");
    }
    //정치인 삭제
    public void deleteByPoliticianName(Long politicianId){
        Optional<PoliticianEntity> Politician = politicianRepository.findById(politicianId);
        PoliticianEntity deletePolitician = Politician.get();
        if(Politician.isPresent()){
            politicianRepository.delete(deletePolitician);
        }
    }
    //정당별 찾기
    public Optional<PoliticalPartyEntity> filterByPolitialName(String politicalName){
        Optional<PoliticalPartyEntity> filterList = politicianRepository.findByPoliticalPartyContaining(politicalName);
        if(filterList.isPresent()){
            return filterList;
        }
        throw new IllegalArgumentException("해당 정당이 없습니다.");
    }
}
