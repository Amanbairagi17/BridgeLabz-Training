package com.jsondata.convetjavaobjectintojsonusingjackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 2022));
        cars.add(new Car("Audi", 2023));
        cars.add(new Car("Tesla", 2024));

        ObjectMapper mapper = new ObjectMapper();

        String jsonArray = mapper.writeValueAsString(cars);

        System.out.println(jsonArray);
    }
}
