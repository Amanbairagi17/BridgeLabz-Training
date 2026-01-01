package com.objectmodelling.level1.company;

public class DriverClass {
	public static void main(String[] args) {
		// create object of company and then deleting
		Company company = new Company("Brainzer's");
		company.addDepartment("Technical");
		Department department = company.departments.get(0);
		department.addEmployee(0, "Employee1");
		company.deleteCompany();
		System.out.println(company);
		System.out.println(department);
	}
}
