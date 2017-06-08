package org.EmployeeRespirotories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentDao {

	public String getDepartmentName(String deptNo) {
		String sqlQuery = "select departments.dept_name from departments where departments.dept_no= ?";
		// System.out.println(sqlQuery);

		try (Connection conn = JDBCConnectionFactory.getConnection();
				PreparedStatement pstmnt = conn.prepareStatement(sqlQuery)) {
			pstmnt.setString(1, deptNo);
			ResultSet rs = pstmnt.executeQuery();

			while (rs.next()) {
				return rs.getString(1);
				
			}

			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String getDepartmentNumber(int empNo) {
		String sqlQuery = "select dept_emp.dept_no from dept_emp where dept_emp.emp_no = ?";
		// System.out.println(sqlQuery);

		try (Connection conn = JDBCConnectionFactory.getConnection();
				PreparedStatement pstmnt = conn.prepareStatement(sqlQuery)) {
			pstmnt.setInt(1, empNo);
			ResultSet rs = pstmnt.executeQuery();

			while (rs.next()) {
				return rs.getString(1);
				
			}

			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return null;
	}
}
