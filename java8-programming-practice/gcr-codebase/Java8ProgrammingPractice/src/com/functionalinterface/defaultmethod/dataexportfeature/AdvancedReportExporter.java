package com.functionalinterface.defaultmethod.dataexportfeature;

public class AdvancedReportExporter implements ReportExporter {

    @Override
    public void exportToCSV() {
        System.out.println("Advanced report exported to CSV");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Advanced report exported to PDF");
    }

    @Override
    public void exportToJSON() {
        System.out.println("Advanced report exported to JSON");
    }
}
