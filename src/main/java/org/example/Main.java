package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

        System.out.println("Personajes por origen y genero: \n");
        Map<String, Map<String, Long>> personajesOrigenGenero = allCharacters.stream()
                .collect(Collectors.groupingBy(
                        p -> p.getOrigin().getName(),
                        Collectors.groupingBy(
                                ResultsItem::getGender,
                                Collectors.counting()
                        )
                ));

        personajesOrigenGenero.forEach((origen, generoMap) -> {
            System.out.println("Origen: " + origen);
            generoMap.forEach((genero, cantidad) -> {
                System.out.println("   Género: " + genero + " -> " + cantidad);
            });
            System.out.println();
        });


    }
}
