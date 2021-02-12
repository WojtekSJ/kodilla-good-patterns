package com.kodilla.good.patterns.challenges.FlightService;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {
    public void findAllFligtsTo(String destinationCity, FlightList flightList) {
        System.out.println("\nWszystkie loty z " + destinationCity + " to: ");
        flightList.getConnectionList().stream()
                .filter(e -> e.getStartCity().equals(destinationCity))
                .map(e -> e.getStartCity() +" -> " + e.getDestinationCity())
                .forEach(System.out::println);
    }

    public void findAllFligtsFrom(String startCity, FlightList flightList) {
        System.out.println("\nWszystkie loty do " + startCity + " to: ");
        flightList.getConnectionList().stream()
                .filter(e -> e.getDestinationCity().equals(startCity))
                .map(e -> e.getStartCity() + " -> " + e.getDestinationCity())
                .forEach(System.out::println);
    }

    public void findAllInterimFlights(String startCity, String destinationCity, FlightList flightList) {
        Set<Connection> secondFligt;
        Set<Connection> firstFligt;
        System.out.println("\nLoty posrednie z: " +startCity + " do " +destinationCity);
            secondFligt = flightList.getConnectionList().stream()
                .filter(e -> e.getDestinationCity().equals(destinationCity))
                    .collect(Collectors.toSet());

            for(Connection temp: secondFligt) {
                firstFligt = flightList.getConnectionList().stream()
                        .filter(e -> e.getStartCity().equals(startCity))
                        .filter(e ->e.getDestinationCity().equals(temp.getStartCity()))
                        .collect(Collectors.toSet());

                if (firstFligt.size()!=0) {
                    for (Connection firstFlightTemp: firstFligt) {
                        System.out.println(firstFlightTemp.getStartCity() +
                                " -> " + firstFlightTemp.getDestinationCity() + " oraz " + temp.getStartCity() + " -> "
                                + temp.getDestinationCity());
                    }
                }
            }
    }
}
