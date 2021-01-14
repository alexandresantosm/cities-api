package com.github.alexandresantosm.citiesapi.states.resource;

import com.github.alexandresantosm.citiesapi.states.domain.State;
import com.github.alexandresantosm.citiesapi.states.exception.StateNotFoundException;
import com.github.alexandresantosm.citiesapi.states.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateResource {

    @Autowired
    private StateService stateService;

    @GetMapping
    public Page<State> findAllStates(Pageable page) {
        return stateService.findAllStates(page);
    }

    @GetMapping("/{id}")
    public State findByIdState(@PathVariable Long id) throws StateNotFoundException {
        return stateService.findByIdState(id);
    }
}
