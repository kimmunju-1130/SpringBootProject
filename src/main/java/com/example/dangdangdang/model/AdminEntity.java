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
public class AdminEntity {
    @Id
    String adminEntity;
    @Column
    String adminName;
    String adminPassword;
    String adminGender;
    String adminEmail;
}
