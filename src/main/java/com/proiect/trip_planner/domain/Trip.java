package com.proiect.trip_planner.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Getter
public class Trip {
//    Relatie Trip-User de tip M:M (un user poate participa la mai multe Tripuri, un Trip poate avea unul sau mai multi participanti/useri)
//    Relatie Trip-Event de tip 1:M (un Trip poate avea mai multe Event-uri)
    private String tripName;
    private String description;
    private Country countryName;
    private Date startDate;
    private Date endDate;
    private ToDoList checkList;
    private List<User> participanti = new ArrayList<>();
    private List<Event> evenimenteTrip = new ArrayList<>();

    private void addParticipant(String email){
//        Search user by email
        User userToAdd = User.builder().build();
        participanti.add(userToAdd);
    }

    private void addEvent(Event event){
        evenimenteTrip.add(event);
    }
}
