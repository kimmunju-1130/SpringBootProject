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
public class PledgeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long pledgeId;
    @Column
    String pledgeName;
    String kind;
    boolean fulfill;
    Long policianId;
}
