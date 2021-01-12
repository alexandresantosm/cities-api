package com.github.alexandresantosm.citiesapi.countries.service;

import java.util.List;

import com.github.alexandresantosm.citiesapi.countries.domain.Country;
import com.github.alexandresantosm.citiesapi.countries.repository.CountryRepository;

public class CountryService {
	
	private CountryRepository countryRepository;
	
	public CountryService(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}
	
	public List<Country> findAll() {
		return countryRepository.findAll();
	}
}
