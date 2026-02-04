package com.functionalinterface.defaultinterface.staticmethod;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateFormatterUtils {

    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }

    // Predefined invoice formats
    static String invoiceFormat(LocalDate date) {
        return formatDate(date, "dd-MM-yyyy");
    }

    static String reportFormat(LocalDate date) {
        return formatDate(date, "yyyy/MM/dd");
    }
}
