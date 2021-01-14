package com.github.alexandresantosm.citiesapi.city.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CityNotFoundException extends Exception {

    public CityNotFoundException(Long id) {
        super("City not found with ID " + id);
    }
}
