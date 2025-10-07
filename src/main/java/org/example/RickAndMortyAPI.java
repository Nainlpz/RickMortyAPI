package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class RickAndMortyAPI {

    private static final String API_URL = "https://rickandmortyapi.com/api/character?page=";

    public List<ResultsItem> getCharacters(int page) throws IOException {
        URL url = new URL(API_URL + page);
        ObjectMapper mapper = new ObjectMapper();
        Characters response = mapper.readValue(url, Characters.class);
        return response.getResults();
    }
}
