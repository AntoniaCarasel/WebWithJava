package com.proiect.trip_planner.repository;

import com.proiect.trip_planner.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepo implements Repo<User>{
    private Long idUser = 1L;
    private List<User> userList = new ArrayList<>();

    @Override
    public User save(User object) {
        object.setId(idUser++);
        userList.add(object);
        return object;
    }

    @Override
    public Optional<User> getObject(Long id) {
        return userList.stream().filter(userf -> userf.getId().equals(id)).findAny();
    }

    @Override
    public List<User> getAll() {
        return userList;
    }

    @Override
    public boolean delete(Long id){
        Optional<User> userFound = userList.stream().filter(userf -> userf.getId().equals(id)).findAny();
        if(userFound.isPresent()){
            userList.remove(userFound);
            return true;
        }
        return false;
    }

}
