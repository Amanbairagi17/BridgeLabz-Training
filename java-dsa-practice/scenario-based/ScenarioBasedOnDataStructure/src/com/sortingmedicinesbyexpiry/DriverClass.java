package com.sortingmedicinesbyexpiry;

import java.util.List;

public class DriverClass {
    public static void main(String[] args) {

        List<Medicine> branch1 = List.of(
                new Medicine("Paracetamol", 5),
                new Medicine("Aspirin", 10),
                new Medicine("Insulin", 20)
        );

        List<Medicine> branch2 = List.of(
                new Medicine("Vitamin C", 3),
                new Medicine("Cough Syrup", 15)
        );

        List<Medicine> branch3 = List.of(
                new Medicine("Antibiotic", 7),
                new Medicine("Painkiller", 12)
        );

        List<List<Medicine>> branches =
                List.of(branch1, branch2, branch3);

        List<Medicine> finalList =
                Sort.mergeAll(branches);

        System.out.println("Final sorted expiry list:");
        finalList.forEach(System.out::println);
    }
}
