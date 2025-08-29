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
    public UserEntity addUser(String userId, String userPassword){
        if(userId.equals(userRepository.findByUserId(userId))){
            throw new IllegalArgumentException("아이디가 중복입니다.");
        }

        UserEntity user = new UserEntity();
        user.setUserId(userId);
        user.setUserPassword(userPassword);

        return userRepository.save(user);
    }
    //회원삭제
    public void deleteUser(String id){
        Optional<UserEntity> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new IllegalArgumentException("존재하지 않는 회원입니다.");
        }
        UserEntity deletedUser = user.get();
        userRepository.delete(deletedUser);
    }
    //로그인
    public Boolean login(String userId, String userPassword){
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
        Optional<UserEntity> user = userRepository.findByUserName(userName);
        if(user.isPresent()){
            //null이 절대아님.
            return Optional.of(user.get().getUserId());
        }
        //null임.
        return Optional.empty();

    }

}
