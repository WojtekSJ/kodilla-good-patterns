package com.kodilla.good.patterns.challenges.FlightService;

import java.util.Objects;

public class Connection {
    private String startCity;
    private String destinationCity;

    public Connection(String startCity, String destinationCity) {
        this.startCity = startCity;
        this.destinationCity = destinationCity;
    }

    public String getStartCity() {
        return startCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Connection that = (Connection) o;
        return startCity.equals(that.startCity) &&
                destinationCity.equals(that.destinationCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startCity, destinationCity);
    }
}
