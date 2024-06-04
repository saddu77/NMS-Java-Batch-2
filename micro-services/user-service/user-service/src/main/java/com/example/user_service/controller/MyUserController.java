package com.example.user_service.controller;

import com.example.user_service.model.MyUser;
import com.example.user_service.repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MyUserController {
    @Autowired
    MyUserRepository userRepository;

    @PostMapping("/users")
    public ResponseEntity<MyUser> createUser(@RequestBody MyUser user) {
        try {
            MyUser my_user = userRepository.save(new MyUser(user.getUsername(), user.getPassword()));
            return new ResponseEntity<>(my_user, HttpStatus.CREATED);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/users")
    public ResponseEntity<List<MyUser>> getAllUsers() {
        try {
            List<MyUser> users = new ArrayList<MyUser>();
            userRepository.findAll().forEach(users::add);
            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<MyUser> getUserById(@PathVariable("id") long id){
        Optional<MyUser> myUser = userRepository.findById(id);
        if(myUser.isPresent()){
            return new ResponseEntity<>(myUser.get(),HttpStatus.OK);
        }
        return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<MyUser> updateUser(@PathVariable("id") long id,@RequestBody MyUser user){
        Optional<MyUser> userData = userRepository.findById(id);
        if(userData.isPresent()){
            MyUser _user = userData.get();
            _user.setUsername(user.getUsername());
            _user.setPassword(user.getPassword());
            return new ResponseEntity<>(userRepository.save(_user),HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<HttpStatus> deleteUserById(@PathVariable("id") long id){
        try{
            userRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch(Exception ex){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
