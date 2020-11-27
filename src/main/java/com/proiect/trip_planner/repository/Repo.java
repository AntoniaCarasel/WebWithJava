package com.proiect.trip_planner.repository;

import java.util.List;
import java.util.Optional;

public interface Repo<O> {
    O save(O object);
    List<O> getAll();
    Optional<O> getObject(Long id);
    boolean delete(Long id);
}
