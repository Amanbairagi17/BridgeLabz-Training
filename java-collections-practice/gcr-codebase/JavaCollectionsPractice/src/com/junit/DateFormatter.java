package com.junit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

    // yyyy-MM-dd → dd-MM-yyyy
    public String formatDate(String inputDate) {

        try {
            LocalDate date =
                    LocalDate.parse(inputDate, DateTimeFormatter.ISO_LOCAL_DATE);

            return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        } catch (DateTimeParseException | NullPointerException e) {
            throw new IllegalArgumentException("Invalid date format");
        }
    }
}
