package com.functionalinterface.defaultinterface.staticmethod;

import java.time.LocalDate;

public class DateFormatterMain {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("Invoice Date : " +
                DateFormatterUtils.invoiceFormat(today));

        System.out.println("Report Date  : " +
                DateFormatterUtils.reportFormat(today));
    }
}
