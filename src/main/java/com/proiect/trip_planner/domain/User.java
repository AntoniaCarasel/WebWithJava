package com.proiect.trip_planner.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class User {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String description;
    private Integer age;


}
