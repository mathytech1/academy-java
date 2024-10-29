package com.bptn.course.week6._jdbc_postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		String sql = "Select \"studentName\" from students where \"studentId\" = 1";
		String url = "jdbc:postgresql://localhost:5432/bptn";
		String username = "postgres";
		String password = "pg123";

		try {
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			rs.next();

			System.out.println(rs.getString(1));

//			int i = 1;
//			while (rs.next()) {
//				System.out.println(rs.getString(i));
//				i++;
//			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
