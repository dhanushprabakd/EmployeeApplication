package org.EmployeeRespirotories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.EmployeeBeans.Employee;

public class EmployeeDao {

	public Employee getEmployeeRecords(int empNo) {
		String sqlQuery = "SELECT employees.emp_no,employees.first_name,employees.last_name,employees.gender,employees.birth_date,employees.hire_date from employees.employees where employees.emp_no = ?";
		// System.out.println(sqlQuery);

		try (Connection conn = JDBCConnectionFactory.getConnection();
				PreparedStatement pstmnt = conn.prepareStatement(sqlQuery)) {
			pstmnt.setInt(1, empNo);
			ResultSet rs = pstmnt.executeQuery();
			Employee emp = new Employee();

			while (rs.next()) {
				emp.setNumber(rs.getInt(1));
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				emp.setGender(rs.getString(4));
				emp.setBirthDate(rs.getDate(5));
				emp.setHireDate(rs.getDate(6));
				
			}

			return emp;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
