package com.github.alexandresantosm.citiesapi.states.service;

import com.github.alexandresantosm.citiesapi.states.domain.State;
import com.github.alexandresantosm.citiesapi.states.exception.StateNotFoundException;
import com.github.alexandresantosm.citiesapi.states.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public Page<State> findAllStates(Pageable page) {
        return stateRepository.findAll(page);
    }

    public State findByIdState(Long id) throws StateNotFoundException {
        return stateRepository.findById(id)
                .orElseThrow(() -> new StateNotFoundException(id));
    }
}
