package com.streamapi.claimanalysis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;


public class ClaimAnalysis {
	 public static void main(String[] args) {

	        List<InsuranceClaim> claims = Arrays.asList(
	                new InsuranceClaim("Health", 5000),
	                new InsuranceClaim("Vehicle", 12000),
	                new InsuranceClaim("Health", 7000),
	                new InsuranceClaim("Home", 15000),
	                new InsuranceClaim("Vehicle", 8000)
	        );

	        Map<String, Double> avgClaimByType =
	                claims.stream()
	                      .collect(groupingBy(
	                              InsuranceClaim::getClaimType,
	                              averagingDouble(InsuranceClaim::getAmount)
	                      ));

	        avgClaimByType.forEach((type, avg) ->
	                System.out.println(type + " -> " + avg));
	    }
}
