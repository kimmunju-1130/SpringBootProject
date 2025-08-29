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
public class CommitteeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long committeeId;
    @Column
    String committeeName;
}
