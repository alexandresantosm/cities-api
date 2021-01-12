package com.github.alexandresantosm.citiesapi.countries.resource;

import java.util.List;

import com.github.alexandresantosm.citiesapi.countries.domain.Country;
import com.github.alexandresantosm.citiesapi.countries.service.CountryService;

public class CountryResource {

	private CountryService countryService;

	public CountryResource(CountryService countryService) {
		this.countryService = countryService;
	}
	
	public List<Country> findAll() {
		return countryService.findAll();
	}
}
