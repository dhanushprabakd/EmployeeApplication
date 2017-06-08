package org.EmployeeRespirotories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeSalaryDao {
	public double getSalary(int empNo) {
		String sqlQuery = "Select Salary from salaries where emp_no=?";
		// System.out.println(sqlQuery);

		try (Connection conn = JDBCConnectionFactory.getConnection();
				PreparedStatement pstmnt = conn.prepareStatement(sqlQuery)) {
			pstmnt.setInt(1, empNo);
			ResultSet rs = pstmnt.executeQuery();

			while (rs.next()) {
				return rs.getDouble(1);
				
			}

			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return 0;
	}

	
}
