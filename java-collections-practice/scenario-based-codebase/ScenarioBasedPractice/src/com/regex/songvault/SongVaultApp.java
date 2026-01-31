package com.regex.songvault;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class SongVaultApp {

    // Regex patterns
    private static final Pattern TITLE =
            Pattern.compile("Title:\\s*(.*)");

    private static final Pattern ARTIST =
            Pattern.compile("Artist:\\s*(.*)");

    private static final Pattern DURATION =
            Pattern.compile("Duration:\\s*(.*)");

    private static final Pattern GENRE =
            Pattern.compile("Genre:\\s*(.*)");

    public static void main(String[] args) throws Exception {

        Path songFolder = Paths.get("src/com/regex/source/song");

        List<Song> songs = new ArrayList<>();
        Map<String, List<Song>> genreMap = new HashMap<>();
        Set<String> artists = new HashSet<>();

        // read all song files
        try (Stream<Path> paths = Files.list(songFolder)) {

            paths.filter(p -> p.toString().endsWith(".txt"))
                 .forEach(path -> {

                     try {
                         Song song = parseSong(path);
                         songs.add(song);
                         artists.add(song.getArtist());

                     } catch (Exception e) {
                         System.out.println(
                                 "Skipped file → " +
                                 path.getFileName());
                     }
                 });
        }

        // group by genre
        genreMap =
                songs.stream()
                        .collect(Collectors.groupingBy(
                                Song::getGenre));

        System.out.println(" ALL SONGS ");
        songs.forEach(System.out::println);

        System.out.println("\n UNIQUE ARTISTS ");
        artists.forEach(System.out::println);

        System.out.println("\n SONGS BY GENRE ");
        genreMap.forEach((g, list) -> {
            System.out.println("\n" + g);
            list.forEach(System.out::println);
        });

        // Stream filtering & sorting
        System.out.println("\n ROCK SONGS SORTED BY TITLE ");

        songs.stream()
                .filter(s -> s.getGenre().equalsIgnoreCase("Rock"))
                .sorted(Comparator.comparing(Song::getTitle))
                .forEach(System.out::println);
    }

    private static Song parseSong(Path path)
            throws IOException {

        String content = Files.readString(path);

        String title = extract(TITLE, content);
        String artist = extract(ARTIST, content);
        String duration = extract(DURATION, content);
        String genre = extract(GENRE, content);

        if (title == null || artist == null ||
                duration == null || genre == null)
            throw new RuntimeException("Invalid file");

        return new Song(title, artist, duration, genre);
    }

    private static String extract(Pattern p, String text) {

        Matcher m = p.matcher(text);
        return m.find() ? m.group(1).trim() : null;
    }
}
}
