package com.zemno.serverapplication.salonserver.service;

import com.zemno.serverapplication.salonserver.model.Role;
import com.zemno.serverapplication.salonserver.model.User;
import com.zemno.serverapplication.salonserver.model.UserStatus;
import com.zemno.serverapplication.salonserver.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private User currentUser;
    @Autowired
    private UserRepo userRepo;

    public UserStatus loginUser(User user) {
        Optional<User> u = userRepo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (u.isPresent()){
            currentUser = u.get();
            if (currentUser.getRole().equals(Role.ADMIN)){
                System.out.println("user " + currentUser.getUsername() + " with role " + currentUser.getRole().toString() + " connected to SERVER");
                return UserStatus.CREATED_ADMIN;
            }
            if (currentUser.getRole().equals(Role.USER)){
                System.out.println("user " + currentUser.getUsername() + " with role " + currentUser.getRole().toString() + " connected to SERVER");
                return UserStatus.CREATED_USER;
            }
        }
        return UserStatus.UNKNOWER;
    }

    public boolean registerUser(User user) {
        Optional<User> u = userRepo.findByUsername(user.getUsername());
        if (u.isPresent() == false){
            userRepo.save(user);
            return true;
        }
        return false;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public List<User> getAll() {
        return userRepo.findAll();
    }

    public void update(User user) {
        userRepo.save(user);
    }

    public boolean add(User user) {
        userRepo.save(user);
        return true;
    }

    public void delete(Long id) {
        userRepo.deleteById(id);
    }
}
