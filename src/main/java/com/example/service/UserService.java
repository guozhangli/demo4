package com.example.service;

import com.example.entity.User;
import com.example.entity.User2;
import com.example.mapper.UserMapper;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUser(){
        return userMapper.findAllUser();
    }

    public User2 findUser2ById(long id){
        return userRepository.findUserById(id);
    }

    public void insert(User2 user2){
        userRepository.save(user2);
    }

    public void update(User2 user2){
        userRepository.save(user2);
    }

    public void delete(long id){
        userRepository.deleteById(id);
    }

    public List<User2> findAllUser2(){
        return userRepository.findAll();
    }

}
