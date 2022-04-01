package com.zemno.serverapplication.salonserver;

import com.zemno.serverapplication.salonserver.model.Role;
import com.zemno.serverapplication.salonserver.model.User;
import com.zemno.serverapplication.salonserver.repository.UserRepo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.NoSuchElementException;
import java.util.Optional;

@SpringBootTest
public class ServerApplicationTests {

    @Autowired
    private UserRepo userRepo;
    private User user;

    @Test
    void contextLoads() {

    }

    @Test
    public void insertNewUserToDB(){
        user = new User("newUser", "newPassword", Role.ADMIN);
        Assert.assertNotNull(userRepo.save(user));
    }

    @Test
    public void findUserByName(){
        Assert.assertNotNull(userRepo.findByUsername("user"));
    }

    @Test
    public void deleteUserFromDB(){
        Optional<User> user = userRepo.findByUsername("");
        userRepo.deleteById(user.get().getId());
        Assert.assertThrows(NoSuchElementException.class, () -> {
            userRepo.findByUsername("user").get();
        });
    }
}
