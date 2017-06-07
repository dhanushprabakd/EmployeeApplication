package org.EmployeeServices;

import java.util.ArrayList;

import org.EmployeeBeans.Employee;
import org.EmployeeDBImpl.EmployeeDBImpl;
import org.EmployeeDBImpl.EmployeeDBInterface;

public class EmployeeOperations {
	
	EmployeeDBInterface dbImpl = new EmployeeDBImpl();
	
	public Employee getEmployee(int empNo){
		return dbImpl.getEmployeeInfo(empNo);
	}
}
