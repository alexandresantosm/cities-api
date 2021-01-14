package com.github.alexandresantosm.citiesapi.countries.service;

import java.util.List;

import com.github.alexandresantosm.citiesapi.countries.domain.Country;
import com.github.alexandresantosm.citiesapi.countries.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
	
	public Page<Country> findAllCountries(Pageable page) {
		return countryRepository.findAll(page);
	}
}
