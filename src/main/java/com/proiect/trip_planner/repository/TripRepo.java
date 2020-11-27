package com.proiect.trip_planner.repository;


import com.proiect.trip_planner.domain.Trip;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TripRepo implements Repo<Trip>{
    @Override
    public Trip save(Trip object) {
        return null;
    }

    @Override
    public List<Trip> getAll() {
        return null;
    }

    @Override
    public Optional<Trip> getObject(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
