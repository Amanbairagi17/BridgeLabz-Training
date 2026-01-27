package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptions {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("Result = " + result);

        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter valid input, numeric values.");
        }
        finally {
            sc.close();
        }
    }
}
