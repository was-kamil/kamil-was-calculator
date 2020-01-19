package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightScanner {

    private Map<String, Boolean> aiport = new HashMap<>();

        public String findFlight(Flight flight) throws RouteNotFoundException {

            aiport.put("Szanghaj-Pudong", false);
            aiport.put("Madryt-Barajas", true);
            aiport.put("Bangkok-Suvarnabhumi", false);
            aiport.put("Chicago-O’Hare", true);
            aiport.put("Saudy-Ad-Dammam", false);

            Boolean flightFound = false;


            if (aiport.containsKey(flight.getArrivalAirport())) {
                flightFound = aiport.get(flight.getArrivalAirport());
                }
            if (flightFound) {
               return "Flight to " + flight.getArrivalAirport() + " has been found!";

            } else { throw new RouteNotFoundException(); } }


        public void addDestination(String destination, Boolean available) {
        }



    public static void main(String[] args) {

            Flight result = new Flight("Szanghaj-Pudong", "Saudy-Ad-Dammam");
            FlightScanner finder = new FlightScanner();
            finder.addDestination("Saudy-Ad-Dammam", true);

                    try{
                        System.out.println(finder.findFlight(result));
                    }
                    catch(RouteNotFoundException e) {
                        System.out.println("\n" + "Thrown exception named: " + e);
                    }
                    finally{
                        System.out.println("End of searching program.");
                    }
    }
}