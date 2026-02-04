package com.functionalinterface.defaultmethod.dataexportfeature;

public class InventoryReportExporter implements ReportExporter {

    @Override
    public void exportToCSV() {
        System.out.println("Inventory report exported to CSV");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Inventory report exported to PDF");
    }
}

