package com.kodilla.good.patterns.challenges.airlineCompany.data;

import java.util.Objects;


public class City {

    private final String cityName;
    private final long cityCode;

    public City(String cityName, long cityCode) {
        this.cityName = cityName;
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public long getCityCode() {
        return cityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return cityCode == city.cityCode && Objects.equals(cityName, city.cityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, cityCode);
    }
}