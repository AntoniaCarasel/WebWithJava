package com.proiect.trip_planner.mapper;

import com.proiect.trip_planner.domain.User;
import com.proiect.trip_planner.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
//    public User toEntity(UserDTO userDTO){
//        return new User(userDTO.getSurname(), userDTO.getName(), userDTO.getDescription(), userDTO.getEmail(), userDTO.getAge());
//    }

    public UserDTO toDTO(User user){
        return new UserDTO(user.getName(), user.getSurname(), user.getEmail(), user.getDescription(), user.getAge());
    }
}
