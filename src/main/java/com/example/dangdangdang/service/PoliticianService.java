package com.example.dangdangdang.service;

import com.example.dangdangdang.model.PoliticianEntity;
import com.example.dangdangdang.repository.PoliticianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoliticianService {
    @Autowired
    public PoliticianRepository politicianRepository;

    public void addPolitician(PoliticianEntity politician){
        //PoliticianEntity

    }
}
