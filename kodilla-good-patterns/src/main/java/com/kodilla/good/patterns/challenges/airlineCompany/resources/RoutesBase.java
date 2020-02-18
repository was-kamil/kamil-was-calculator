package com.kodilla.good.patterns.challenges.airlineCompany.resources;

import com.kodilla.good.patterns.challenges.airlineCompany.data.City;
import java.util.*;


public class RoutesBase implements RoutesInterface {

    public Map<City, Set<City>> createConnection() {

        City gdansk = new City("Gdansk", 80);
        City wroclaw = new City("Wroclaw", 50);
        City cracow = new City("Krakow", 30);
        City warsaw = new City("Warszawa", 00);
        City gdynia = new City("Gdynia", 81);

        Set<City> gdanskConnection = new HashSet<>();
        Set<City> wroclawConnection = new HashSet<>();
        Set<City> cracowConnection = new HashSet<>();
        Set<City> warsawConnection = new HashSet<>();
        Set<City> gdyniaConnection = new HashSet<>();

        Map<City, Set<City>> destinationMap = new HashMap<>();

            gdanskConnection.add(wroclaw);
            gdanskConnection.add(cracow);
            gdanskConnection.add(gdynia);

            wroclawConnection.add(gdansk);
            wroclawConnection.add(cracow);
            wroclawConnection.add(warsaw);

            cracowConnection.add(warsaw);
            cracowConnection.add(gdansk);
            cracowConnection.add(wroclaw);
            cracowConnection.add(gdynia);

            gdyniaConnection.add(warsaw);
            gdyniaConnection.add(wroclaw);

            warsawConnection.add(gdynia);
            warsawConnection.add(cracow);
            warsawConnection.add(wroclaw);

        destinationMap.put(gdansk, gdanskConnection);
        destinationMap.put(wroclaw, wroclawConnection);
        destinationMap.put(cracow, cracowConnection);
        destinationMap.put(warsaw, warsawConnection);
        destinationMap.put(gdynia, gdyniaConnection);

        return new HashMap<>(destinationMap);
    }
}