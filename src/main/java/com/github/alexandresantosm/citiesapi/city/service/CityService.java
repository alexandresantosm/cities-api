package com.github.alexandresantosm.citiesapi.city.service;

import com.github.alexandresantosm.citiesapi.city.domain.City;
import com.github.alexandresantosm.citiesapi.city.exception.CityNotFoundException;
import com.github.alexandresantosm.citiesapi.city.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public Page<City> findAllCities(Pageable page) {
        return cityRepository.findAll(page);
    }

    public City findByIdCity(Long id) throws CityNotFoundException {
        return cityRepository.findById(id)
                .orElseThrow(() -> new CityNotFoundException(id));
    }
}
