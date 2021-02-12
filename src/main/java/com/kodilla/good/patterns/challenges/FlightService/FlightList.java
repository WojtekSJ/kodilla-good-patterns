package com.kodilla.good.patterns.challenges.FlightService;
import java.util.HashSet;
import java.util.Set;

public class FlightList {
    private Set<Connection> connectionList =new HashSet<>();

    public FlightList() {

        connectionList.add(new Connection("Warszawa", "Wrocław"));
        connectionList.add(new Connection("Poznań", "Kraków"));
        connectionList.add(new Connection("Warszawa", "Kraków"));
        connectionList.add(new Connection("Kraków", "Wrocław"));
        connectionList.add(new Connection("Opole", "Wrocław"));
        connectionList.add(new Connection("Kraków", "Warszawa"));
        connectionList.add(new Connection("Gdańsk", "Opole"));
        connectionList.add(new Connection("Opole", "Gdańsk"));
        connectionList.add(new Connection("Gdańsk", "Warszawa"));
        connectionList.add(new Connection("Gdańsk", "Warszawa"));
    }

    public Set<Connection> getConnectionList() {
        return connectionList;
    }
}
