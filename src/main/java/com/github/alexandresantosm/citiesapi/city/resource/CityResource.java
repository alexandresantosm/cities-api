package com.github.alexandresantosm.citiesapi.city.resource;

import com.github.alexandresantosm.citiesapi.city.domain.City;
import com.github.alexandresantosm.citiesapi.city.exception.CityNotFoundException;
import com.github.alexandresantosm.citiesapi.city.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityResource {

    @Autowired
    private CityService cityService;

    @GetMapping
    public Page<City> findAllCities(Pageable page) {
        return cityService.findAllCities(page);
    }

    @GetMapping("/{id}")
    public City findByIdCity(@PathVariable Long id) throws CityNotFoundException {
        return cityService.findByIdCity(id);
    }
}
