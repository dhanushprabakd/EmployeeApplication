package org.EmployeeDBImpl;

import org.EmployeeBeans.Department;
import org.EmployeeBeans.Employee;

public interface EmployeeDBInterface {

	Employee getEmployeeInfo(int empNo);
	
	Department getDepartmentName(int empNo);
	
	double getSalary(int empNo);

}
