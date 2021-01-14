package com.github.alexandresantosm.citiesapi.states.repository;

import com.github.alexandresantosm.citiesapi.states.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
