package com.streamapi.toptrendingmovies;

import java.util.*;
import java.util.stream.*;

public class MovieStreamDemo {
    public static void main(String[] args) {

        List<Movie> movies = List.of(
            new Movie("Movie A", 8.9, 2024),
            new Movie("Movie B", 9.1, 2023),
            new Movie("Movie C", 9.1, 2025),
            new Movie("Movie D", 8.7, 2022),
            new Movie("Movie E", 8.5, 2021),
            new Movie("Movie F", 9.3, 2024),
            new Movie("Movie G", 9.0, 2025)
        );

        List<Movie> top5TrendingMovies =
                movies.stream()
                      .filter(m -> m.getRating() >= 8.5)   // optional filter
                      .sorted(
                          Comparator.comparing(Movie::getRating).reversed()
                                    .thenComparing(Movie::getReleaseYear).reversed()
                      )
                      .limit(5)
                      .collect(Collectors.toList());

        top5TrendingMovies.forEach(
            m -> System.out.println(m.getName() + " | " + m.getRating() + " | " + m.getReleaseYear())
        );
    }
}
