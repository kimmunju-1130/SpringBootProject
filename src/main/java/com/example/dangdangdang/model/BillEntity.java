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
public class BillEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long billId;
    @Column
    String billName;
    String kind;
}
