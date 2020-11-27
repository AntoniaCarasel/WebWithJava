package com.proiect.trip_planner.dto;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
public class UserDTO {
    @NotBlank(message = "The name cannot be null")
    private String name;
    private String surname;
    @NotNull
//    @Pattern(regexp = "\b@gmail.com")
    private String email;
    private String description;
    @Min(1)
    private Integer age;

    public UserDTO(String name, String surname, String email, String description, Integer age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.description = description;
        this.age = age;
    }
}
