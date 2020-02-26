package com.kodilla.good.patterns.challenges.food2door.service;

import com.kodilla.good.patterns.challenges.food2door.data.*;
import com.kodilla.good.patterns.challenges.food2door.resources.*;


public class RequestRetiever {

    public Request retrieve() {
        User user = new User("Wojciech", "Puczyk", "777-777-777", "Warsaw");
        Supplier supplier = new ExtraFoodShop();
        Order order = new Order("Flour", 5, 20.0);

        return new Request(user, supplier, order);
    }

    public Request retrieve2() {
        User user = new User("Bartosz", "Walaszek", "666-666-666", "Warsaw");
        Supplier supplier = new HealthyShop();
        Order order = new Order("Flour", 4, 21.0);

        return new Request(user, supplier, order);
    }

    public Request retrieve3() {
        User user = new User("Adrian", "Puchacki", "555-555-555", "Warsaw");
        Supplier supplier = new GlutenFreeShop();
        Order order = new Order("Flour", 3, 22.0);

        return new Request(user, supplier, order);
    }

    public Request retrieve4() {
        User user = new User("Wiesław", "Paleta", "444-444-444", "Gdynia");
        Supplier supplier = new HealthyShop();
        Order order = new Order("Flour", 2, 23.0);

        return new Request(user, supplier, order);
    }

    public Request retrieve5() {
        User user = new User("Bastian", "Obsztyfitykultykiewicz", "333-333-333", "Gdansk");
        Supplier supplier = new ExtraFoodShop();
        Order order = new Order("Flour", 1, 24.0);

        return new Request(user, supplier, order);
    }
}