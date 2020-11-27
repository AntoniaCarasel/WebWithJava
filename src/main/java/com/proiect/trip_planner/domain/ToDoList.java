package com.proiect.trip_planner.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
public class ToDoList {
    List<String> tasks = new ArrayList<>();

    private void addTask(String task){
        tasks.add(task);
    }


}
