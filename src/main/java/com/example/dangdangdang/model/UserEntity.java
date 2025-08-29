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
public class UserEntity {
    @Id
    String userId;
    @Column
    String userName;
    String nickName;
    String userPassword;
    String userGender;
    String userEmail;
    String userPreferParty;
}
