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
public class BillHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long billByPoliticianId;
    @Column
    Long politicianId;
    Long billId;
    String role;
}
