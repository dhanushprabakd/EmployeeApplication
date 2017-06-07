package org.EmployeeDBImpl;

import org.EmployeeBeans.Employee;
import org.EmployeeRespirotories.DBQueryExecution;

public class EmployeeDBImpl implements EmployeeDBInterface {
	DBQueryExecution querryExecution = new DBQueryExecution();
	@Override
	public Employee getEmployeeInfo(int empNo) {
		return querryExecution.getEmployeeRecords(empNo);
	}

}
