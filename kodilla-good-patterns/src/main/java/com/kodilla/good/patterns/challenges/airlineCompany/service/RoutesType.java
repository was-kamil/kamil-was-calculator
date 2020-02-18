package com.kodilla.good.patterns.challenges.airlineCompany.service;

import com.kodilla.good.patterns.challenges.airlineCompany.resources.RoutesInterface;
import com.kodilla.good.patterns.challenges.airlineCompany.data.City;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class RoutesType {

    private final RoutesInterface routesInterface;

    public RoutesType(RoutesInterface routesInterface) {
        this.routesInterface = routesInterface;
    }

    public void directConnectionFrom(City city) {

        Map<City, Set<City>> DB = routesInterface.createConnection();

        if (DB.containsKey(city)) {

            List <String> fromCity = DB.get(city).stream()
                    .map(City::getCityName)
                    .collect(Collectors.toList());

            System.out.println("\nConnections available: \n--> FROM:  " + city.getCityName() + "\n<-- TO:    " + fromCity.toString());
        } else {
            System.out.println("\nConnection unavailable");
        }
    }

    public void directConnectionTo(City city) {

        Map<City, Set<City>> DB = routesInterface.createConnection();

        if (DB.containsKey(city)) {

            List<String> toCity = DB.entrySet().stream()
                    .filter(n -> n.getValue().contains(city))
                    .map(n -> n.getKey().getCityName())
                    .collect(Collectors.toList());

            System.out.println("\nConnections available: \n<-- TO:    " + city.getCityName() + "\n--> FROM:  " + toCity.toString());
        } else {
            System.out.println("\nConnection unavailable");
        }
    }

    public void betweenLandingConnection(City fromCity, City toCity) {

        Map<City, Set<City>> DB = routesInterface.createConnection();

        if (DB.containsKey(fromCity) && DB.containsKey(toCity)) {

            Set<City> changeCity = DB.entrySet().stream()
                    .filter(n -> n.getValue().contains((toCity)))
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toSet());

            Set<String> throughCity = DB.get(fromCity).stream()
                    .filter(changeCity::contains)
                    .map(City::getCityName)
                    .collect(Collectors.toSet());

            System.out.println("\nConnections available: \n--> FROM:     " + fromCity.getCityName() + "\n<-- TO:       " + toCity.getCityName() + "\n<-> THROUGH:  " +  throughCity.toString());
        } else {
            System.out.println("\nConnection unavailable");
        }
    }
}