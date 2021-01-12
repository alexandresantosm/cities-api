package com.github.alexandresantosm.citiesapi.countries.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.alexandresantosm.citiesapi.countries.domain.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
