package com.github.alexandresantosm.citiesapi.states.exception;

public class StateNotFoundException extends Exception {

    public StateNotFoundException(Long id) {
        super("State not found with ID " + id);
    }
}
