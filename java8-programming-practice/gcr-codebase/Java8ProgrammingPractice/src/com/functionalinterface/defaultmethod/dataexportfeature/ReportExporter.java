package com.functionalinterface.defaultmethod.dataexportfeature;

public interface ReportExporter {

    void exportToCSV();
    void exportToPDF();

    // New feature added later
    default void exportToJSON() {
        System.out.println("JSON export is not supported by this exporter.");
    }
}
