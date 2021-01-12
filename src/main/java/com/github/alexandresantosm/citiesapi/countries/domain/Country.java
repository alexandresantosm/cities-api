package com.github.alexandresantosm.citiesapi.countries.domain;

public class Country {

	private Long id;
	private String name;
	private String name_pt;
	private String acronym;
	private Integer bacen;

	public Country() {
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getName_pt() {
		return name_pt;
	}

	public String getAcronym() {
		return acronym;
	}

	public Integer getBacen() {
		return bacen;
	}

}
