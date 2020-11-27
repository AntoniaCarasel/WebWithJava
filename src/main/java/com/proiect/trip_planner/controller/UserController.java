package com.proiect.trip_planner.controller;

import com.proiect.trip_planner.domain.User;
import com.proiect.trip_planner.dto.UserDTO;
import com.proiect.trip_planner.mapper.UserMapper;
import com.proiect.trip_planner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/userProfile")
public class UserController {
    @Autowired
    private UserService userService;
    UserMapper userMapper;

    @PostMapping
    public ResponseEntity<UserDTO> saveUser(@RequestBody User user){
        UserDTO userDTO = userMapper.toDTO(userService.saveUser(user));
        return ResponseEntity.
                created(URI.create("/userProfile/"+user.getId())).
                body(userDTO);
    }

    @GetMapping("/{id}")
    public UserDTO getUser(@PathVariable Long id){
        return userMapper.toDTO(userService.getUser(id));
    }

    @GetMapping
    public List<UserDTO> getAllUsers(){
        List<User> userList = userService.getAllUsers();
        List<UserDTO> usersDTOlist = new ArrayList<>();
        for(User user:userList){
            usersDTOlist.add(userMapper.toDTO(user));
        }
        return usersDTOlist;
    }


    @DeleteMapping("/{id}")
    public boolean deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }
}
