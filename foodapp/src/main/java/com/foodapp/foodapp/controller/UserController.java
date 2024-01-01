package com.foodapp.foodapp.controller;

import com.foodapp.foodapp.model.User;
import com.foodapp.foodapp.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/users/{userid}")
    public User getUserById(@PathVariable Long userid){
        return userService.getUserById(userid);
    }
    @GetMapping("/users/{email}/get")
    public User getUserByEmail(@PathVariable String email){
        return userService.getUserByEmail(email);
    }


    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @DeleteMapping("/users/{userid}")
    public void deleteUser(@PathVariable Long userid){
        userService.deleteUserBtId(userid);
    }



}
