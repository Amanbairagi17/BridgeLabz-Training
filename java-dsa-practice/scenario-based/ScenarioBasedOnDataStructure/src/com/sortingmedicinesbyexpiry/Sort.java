package com.sortingmedicinesbyexpiry;

import java.util.ArrayList;
import java.util.List;

public class Sort {

    // merge two sorted lists
    public static List<Medicine> merge(
            List<Medicine> a,
            List<Medicine> b) {

        List<Medicine> result = new ArrayList<>();

        int i = 0, j = 0;

        while (i < a.size() && j < b.size()) {

            if (a.get(i).getExpiryDays()
                    <= b.get(j).getExpiryDays()) {
                result.add(a.get(i++));
            } else {
                result.add(b.get(j++));
            }
        }

        while (i < a.size()) result.add(a.get(i++));
        while (j < b.size()) result.add(b.get(j++));

        return result;
    }

    // merge multiple branches
    public static List<Medicine> mergeAll(
            List<List<Medicine>> branches) {

        List<Medicine> result = branches.get(0);

        for (int i = 1; i < branches.size(); i++) {
            result = merge(result, branches.get(i));
        }

        return result;
    }
}
