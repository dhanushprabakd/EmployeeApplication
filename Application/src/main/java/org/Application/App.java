package org.Application;

import java.util.Scanner; 

import org.EmployeeBeans.Employee;
import org.EmployeeServices.EmployeeOperations;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EmployeeOperations operations = new EmployeeOperations();
		int empNo;
		Scanner scaner = new Scanner(System.in);
		System.out.print("Enter the employee Number:");
		empNo = scaner.nextInt();
		System.out.println("Emp No. \t FirstName \t LastName \t Gender \t DeptName \t Salary");
		Employee emp = operations.getEmployee(empNo);

		System.out.println(emp.getNumber() + "\t" + emp.getFirstName() + "\t" + emp.getLastName() + "\t"
				+ emp.getGender() + "\t" + emp.getDeptName() + "\t" + emp.getSalary());
		scaner.close();
	}
}
