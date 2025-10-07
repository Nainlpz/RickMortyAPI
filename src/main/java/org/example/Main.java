package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        RickAndMortyAPI service = new RickAndMortyAPI();
        List<ResultsItem> allCharacters = new ArrayList<>();

        for (int page = 1; page <= 42; page++) {
            allCharacters.addAll(service.getCharacters(page));
        }

        System.out.println("Todos los personajes vivos: \n");
        allCharacters.stream()
                .filter(p -> "Alive".equals(p.getStatus()))
                .map(ResultsItem::getName)
                .forEach(System.out::println);
        System.out.println("---------------------------------------------------------");

        long humanos = allCharacters.stream()
                .filter(p -> "Human".equals(p.getSpecies()))
                .count();
        System.out.println("Número de humanos: " + humanos);
        System.out.println("---------------------------------------------------------");

        System.out.println("30 primeros personajes ordenados: \n");
        allCharacters.stream()
                .map(ResultsItem::getName)
                .sorted()
                .limit(30)
                .forEach(System.out::println);
        System.out.println("---------------------------------------------------------");


    }
}
