package com.foodapp.foodapp.service;

import com.foodapp.foodapp.model.User;
import com.foodapp.foodapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }
    public void deleteUserBtId(Long id){
        userRepository.deleteById(id);
    }
    public User getUserByEmail(String email){
        return userRepository.findUserByEmail(email);
    }




}
