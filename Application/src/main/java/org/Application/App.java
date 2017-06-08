package org.Application;

import java.util.Scanner;

import org.EmployeeServices.EmployeeOperations;
import org.EmployeeServices.model.EmployeeInformation;

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
		System.out.println("Emp No. \t FirstName \t LastName  \t DeptName \t Gross Salary");
		EmployeeInformation emp = operations.getEmployee(empNo);

		System.out.println(emp.getEmpNo() + "\t\t" + emp.getFirstName() + "\t\t" + emp.getLastName() + "\t"
				 + "\t" + emp.getDeptName() + "\t\t" + emp.getGrossSalary());
		scaner.close();
	}
}
