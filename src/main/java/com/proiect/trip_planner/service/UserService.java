package com.proiect.trip_planner.service;

import com.proiect.trip_planner.domain.User;
import com.proiect.trip_planner.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public User saveUser(User user){
        return userRepo.save(user);
    }

    public User getUser(Long id){
        Optional<User> userFound = userRepo.getObject(id);
        if(userFound.isPresent()){
            return userFound.get();
        }
        return null;
    }

    public List<User> getAllUsers(){
        return userRepo.getAll();
    }

    public boolean deleteUser(Long id){
        return userRepo.delete(id);
    }

}
