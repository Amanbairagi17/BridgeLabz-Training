package com.annotations.apimetadatavalidator;

public class LabTestController {

    @PublicAPI(description = "Get all available lab tests")
    public void getAllTests() {}

    @PublicAPI(description = "Book a lab test")
    @RequiresAuth(role = "PATIENT")
    public void bookTest() {}

    public void deleteTest() {} //  Missing annotation
}
