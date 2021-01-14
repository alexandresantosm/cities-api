package com.github.alexandresantosm.citiesapi.city.repository;

import com.github.alexandresantosm.citiesapi.city.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
