package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
       MovieStore mov1 = new MovieStore();

        String collected = mov1.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.joining("! "));

        System.out.println(collected);
    }
}
