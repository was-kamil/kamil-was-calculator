package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        Country egypt = new Country("Egypt", new BigDecimal("104692000"));
        Country sweden = new Country("Sweden", new BigDecimal("8699520"));
        Country canada = new Country("Canada", new BigDecimal("37858000"));
        Country argentina = new Country("Argentina", new BigDecimal("45363381"));

        Continent continentEurope = new Continent("Europe");
        Continent continentAfrica = new Continent("Africa");
        Continent continentNorthAmerica = new Continent("North America");
        Continent continentSouthAmerica = new Continent("South America");

        continentEurope.addCountry(sweden);
        continentAfrica.addCountry(egypt);
        continentNorthAmerica.addCountry(canada);
        continentSouthAmerica.addCountry(argentina);

        World world = new World();
            world.addContinent(continentEurope);
            world.addContinent(continentAfrica);
            world.addContinent(continentNorthAmerica);
            world.addContinent(continentSouthAmerica);


        BigDecimal totalPeopleQuantity = BigDecimal.ZERO;
        totalPeopleQuantity = world.getPeopleQuantity();

        BigDecimal expectedPeopleQuantity = BigDecimal.ZERO;
            expectedPeopleQuantity = expectedPeopleQuantity.add(egypt.getPeopleQuantity());
            expectedPeopleQuantity = expectedPeopleQuantity.add(sweden.getPeopleQuantity());
            expectedPeopleQuantity = expectedPeopleQuantity.add(canada.getPeopleQuantity());
            expectedPeopleQuantity = expectedPeopleQuantity.add(argentina.getPeopleQuantity());

        Assert.assertEquals(expectedPeopleQuantity, totalPeopleQuantity);
    }
}