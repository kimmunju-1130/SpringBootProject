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
public class ElectionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long electionId;
    @Column
    String electionName;
    String year;
    int ratioOfApprovalVotes;
}
