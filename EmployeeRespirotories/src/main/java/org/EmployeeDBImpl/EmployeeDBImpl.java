package org.EmployeeDBImpl;

import org.EmployeeBeans.Department;
import org.EmployeeBeans.Employee;
import org.EmployeeRespirotories.DepartmentDao;
import org.EmployeeRespirotories.EmployeeDao;
import org.EmployeeRespirotories.EmployeeSalaryDao;

public class EmployeeDBImpl implements EmployeeDBInterface {
	EmployeeDao employeeDao = new EmployeeDao();
	DepartmentDao departmentDao = new DepartmentDao();
	EmployeeSalaryDao employeeSalaryDao = new EmployeeSalaryDao();
	@Override
	public Employee getEmployeeInfo(int empNo) {
		return employeeDao.getEmployeeRecords(empNo);
	}
	@Override
	public Department getDepartmentName(int empNo) {
		Department dept = new Department();
		dept.setDeptNo(departmentDao.getDepartmentNumber(empNo));
		dept.setDeptName(dept.getDeptNo());
		return dept;
	}
	@Override
	public double getSalary(int empNo) {
		
		return employeeSalaryDao.getSalary(empNo);
	}
	

}
