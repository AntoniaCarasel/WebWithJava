package com.proiect.trip_planner.repository;

import com.proiect.trip_planner.domain.ToDoList;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ToDoListRepo implements Repo<ToDoList> {
    @Override
    public ToDoList save(ToDoList object) {
        return null;
    }

    @Override
    public List<ToDoList> getAll() {
        return null;
    }

    @Override
    public Optional<ToDoList> getObject(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
