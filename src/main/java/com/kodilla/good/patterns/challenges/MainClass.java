package com.kodilla.good.patterns.challenges;

public class MainClass {
    public static void main(String[] args) {
       MovieStore mov1 = new MovieStore();

        mov1.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .map(e -> e + "! ")
                .forEach(System.out::print);

        System.out.println("Test print");
    }
}
