package com.exceptions;

import java.util.Scanner;

public class ArrayExceptionMultipleCatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Example array (set to null to test NullPointerException)
            int[] arr = {10, 20, 30, 40, 50};
            // int[] arr = null;

            System.out.print("Enter index: ");
            int index = sc.nextInt();

            System.out.println("Value at index " + index + ": " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
        finally {
            sc.close();
        }
    }
}
