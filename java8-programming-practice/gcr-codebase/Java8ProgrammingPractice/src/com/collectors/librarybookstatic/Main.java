package com.collectors.librarybookstatic;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.IntSummaryStatistics;

public class Main {
	public static void main(String[] args) {

        List<Book> books = List.of(
                new Book("Book1", "Fiction", 300),
                new Book("Book2", "Fiction", 250),
                new Book("Book3", "Science", 400),
                new Book("Book4", "Science", 350),
                new Book("Book5", "History", 280)
        );

        Map<String, IntSummaryStatistics> summary =
                books.stream()
                        .collect(Collectors.groupingBy(
                                book -> book.getGenre(),
                                Collectors.summarizingInt(book -> book.getPages())
                        ));

        summary.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages: " + stats.getSum());
            System.out.println("Average Pages: " + stats.getAverage());
            System.out.println("Maximum Pages: " + stats.getMax());
            System.out.println();
        });
	}
}
