package com.bankingmanagementsystem;

public class DriverClass {
	public static void main(String[] args){
		Employee employee = new Employee("Name 1", 20, 0);
		Customer customer = new Customer("Name 2", 25, 1);
		Account account = new Account(1001, 1000);
		System.out.print(employee.toString());
	}
}
