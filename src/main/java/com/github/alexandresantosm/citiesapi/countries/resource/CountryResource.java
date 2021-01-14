package com.github.alexandresantosm.citiesapi.countries.resource;

import java.util.List;

import com.github.alexandresantosm.citiesapi.countries.domain.Country;
import com.github.alexandresantosm.citiesapi.countries.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/countries")
public class CountryResource {

	@Autowired
	private CountryService countryService;

	@GetMapping
	public Page<Country> findAllCountries(Pageable page) {
		return countryService.findAllCountries(page);
	}
}
