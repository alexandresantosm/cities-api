package com.github.alexandresantosm.citiesapi.city.service;

import com.github.alexandresantosm.citiesapi.city.domain.City;
import com.github.alexandresantosm.citiesapi.city.repository.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DistanceService {

    @Autowired
    private CityRepository cityRepository;

    Logger log = LoggerFactory.getLogger(DistanceService.class);


    public Double distanceByPointsInMiles(final Long city1, final Long city2) {
        log.info("nativePostgresInMiles({}, {})", city1, city2);

        return cityRepository.distanceByPoints(city1, city2);
    }

    public Double distanceByCubeInMeters(final Long city1, final Long city2) {
        log.info("distanceByCubeInMeters({}, {})", city1, city2);

        final List<City> cities = cityRepository.findAllById((Arrays.asList(city1, city2)));

        Point p1 = cities.get(0).getLocation();
        Point p2 = cities.get(1).getLocation();

        return cityRepository.distanceByCube(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}
