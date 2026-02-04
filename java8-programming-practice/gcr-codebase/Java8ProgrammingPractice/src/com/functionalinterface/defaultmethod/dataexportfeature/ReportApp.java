package com.functionalinterface.defaultmethod.dataexportfeature;

public class ReportApp {
    public static void main(String[] args) {

        ReportExporter sales = new SalesReportExporter();
        sales.exportToCSV();
        sales.exportToPDF();
        sales.exportToJSON();   // default method

        ReportExporter advanced = new AdvancedReportExporter();
        advanced.exportToJSON(); // overridden
    }
}
