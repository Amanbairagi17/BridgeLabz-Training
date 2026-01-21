package com.generic.aidrivenresumescreening;

import java.util.List;

public class DriverClass {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>("Aman",
                        new SoftwareEngineer());

        Resume<DataScientist> r2 =
                new Resume<>("Riya",
                        new DataScientist());

        Resume<ProductManager> r3 =
                new Resume<>("Kunal",
                        new ProductManager());

        ResumeScreener.screenResume(r1);
        ResumeScreener.screenResume(r2);
        ResumeScreener.screenResume(r3);

        // wildcard usage
        List<SoftwareEngineer> seList = List.of(
                new SoftwareEngineer());

        List<DataScientist> dsList = List.of(
                new DataScientist());

        List<ProductManager> pmList = List.of(
                new ProductManager());

        ResumeScreener.bulkScreen(seList);
        ResumeScreener.bulkScreen(dsList);
        ResumeScreener.bulkScreen(pmList);
    }
}
