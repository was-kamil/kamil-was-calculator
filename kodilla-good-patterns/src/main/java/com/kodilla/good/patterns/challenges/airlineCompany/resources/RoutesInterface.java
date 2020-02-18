package com.kodilla.good.patterns.challenges.airlineCompany.resources;

import com.kodilla.good.patterns.challenges.airlineCompany.data.City;
import java.util.Map;
import java.util.Set;


public interface RoutesInterface {

    Map<City, Set<City>> createConnection();
}