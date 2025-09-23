package com.example.dangdangdang.service;

import com.example.dangdangdang.model.UserEntity;
import com.example.dangdangdang.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    //회원추가
    public UserEntity registerUser(String userId, String userPassword){
        Optional<UserEntity> registerUsers = userRepository.findByUserId(userId);
        if(registerUsers.isPresent()){
            throw new IllegalArgumentException("이미 존재하는 아이디 입니다.");
        }

        UserEntity user = new UserEntity();
        user.setUserId(userId);
        user.setUserPassword(userPassword);
        userRepository.save(user);
        return user;
    }
    //회원삭제
    public void deleteUserById(String id){
        Optional<UserEntity> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new IllegalArgumentException("존재하지 않는 회원입니다.");
        }
        UserEntity deletedUser = user.get();
        userRepository.delete(deletedUser);
    }
    //로그인
    public Boolean authenticateUser(String userId, String userPassword){
        Optional<UserEntity> user = userRepository.findByUserId(userId);
        if(user.isEmpty()){
            return false;
        }
        UserEntity foundUser = user.get();
        //.equals가 true, false 반환값이므로.
        return userPassword.equals(userRepository.findByUserPassword());
    }
    //아이디찾기
    public Optional<String> findId(String userName, String userEmail){
        Optional<UserEntity> user = userRepository.findUserByNameAndEail(userName,userEmail);
        if(user.isPresent()){
            //null이 절대아님.
            return Optional.of(user.get().getUserId());
        }
        //null임.
        return Optional.empty();

    }

}
