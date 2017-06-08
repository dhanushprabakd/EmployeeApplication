package org.EmployeeServices;

import org.EmployeeBeans.Department;
import org.EmployeeBeans.Employee;
import org.EmployeeDBImpl.EmployeeDBImpl;
import org.EmployeeDBImpl.EmployeeDBInterface;
import org.EmployeeServices.model.EmployeeInformation;

public class EmployeeOperations {
	
	EmployeeDBInterface dbImpl = new EmployeeDBImpl();
	
	public EmployeeInformation getEmployee(int empNo){
		Employee emp =  dbImpl.getEmployeeInfo(empNo);
		Department dept = dbImpl.getDepartmentName(empNo);
		double salary = dbImpl.getSalary(empNo);
		EmployeeInformation emInformation = new EmployeeInformation();
		emInformation.setEmpNo(emp.getNumber());
		emInformation.setDeptName(dept.getDeptName());
		emInformation.setFirstName(emp.getFirstName());
		emInformation.setLastName(emp.getLastName());
		double grossSalary=salary+salary*0.30;
		emInformation.setGrossSalary(grossSalary);
		return emInformation;
		
	}
}
