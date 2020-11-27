package com.proiect.trip_planner.repository;

import com.proiect.trip_planner.domain.Event;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EventRepo implements Repo<Event>{
    @Override
    public Event save(Event object) {
        return null;
    }

    @Override
    public List<Event> getAll() {
        return null;
    }

    @Override
    public Optional<Event> getObject(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
