package com.example.dangdangdang.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PoliticalPartyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long politicalPartyId;
    @Column
    String politicalName;
    //logo


}
