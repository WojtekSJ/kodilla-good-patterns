package com.kodilla.good.patterns.challenges.FlightService;

public class FlightMain {
    public static void main(String[] args) {
    FlightList flightList = new FlightList();
    FlightFinder finder = new FlightFinder();

    finder.findAllFligtsTo("Gdańsk", flightList);
    finder.findAllFligtsFrom("Warszawa", flightList);

    String destinationCity = "Wrocław";
    String startCity = "Gdańsk";

    finder.findAllInterimFlights(startCity, destinationCity, flightList);
    }
}
