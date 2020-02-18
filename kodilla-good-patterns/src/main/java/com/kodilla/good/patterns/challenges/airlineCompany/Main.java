package com.kodilla.good.patterns.challenges.airlineCompany;

import com.kodilla.good.patterns.challenges.airlineCompany.resources.RoutesInterface;
import com.kodilla.good.patterns.challenges.airlineCompany.resources.RoutesBase;
import com.kodilla.good.patterns.challenges.airlineCompany.data.City;
import com.kodilla.good.patterns.challenges.airlineCompany.service.RoutesType;


public class Main {

    public static void main(String[] args) {

        City gdansk = new City("Gdansk", 80);
        City wroclaw = new City("Wroclaw", 50);
        City cracow = new City("Krakow", 30);
        City warsaw = new City("Warszawa", 00);
        City gdynia = new City("Gdynia", 81);

        RoutesInterface sql = new RoutesBase();
        RoutesType routesType = new RoutesType(sql);

        routesType.directConnectionFrom(gdansk);
        routesType.directConnectionTo(wroclaw);
        routesType.betweenLandingConnection(gdynia, gdansk);
        routesType.betweenLandingConnection(gdansk, wroclaw);
        routesType.betweenLandingConnection(cracow, warsaw);
    }
}