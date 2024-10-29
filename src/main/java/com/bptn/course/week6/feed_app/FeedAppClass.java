package com.bptn.course.week6.feed_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FeedAppClass {
	private static final String userName = "postgres";
	private static final String password = "pg123";
	private static final String dbName = "FeedApp";
	private static final String port = "5432";
	private static final String dbUrl = "localhost";

	public Connection createConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName, userName,
					password);
			System.out.println("Opened database successfully");
		} catch (SQLException e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return con;
	}

	public void addUser(Connection conn, String firstName, String lastName, String username, String phone,
			String emailId, String password, boolean emailVerified) {
		PreparedStatement stmt = null;
		try {
			String sql = "INSERT INTO \"user\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, firstName);
			stmt.setString(2, lastName);
			stmt.setString(3, username);
			stmt.setString(4, phone);
			stmt.setString(5, emailId);
			stmt.setString(6, password);
			stmt.setBoolean(7, emailVerified);

			int resultCount = stmt.executeUpdate();
			System.out.println(resultCount + " record(s) inserted");
			stmt.close();
		} catch (SQLException ex) {
			// handle exception
			System.out.println("Exception:" + ex.getMessage());
		}
	}

	public void getAllUsers(Connection con) {
		try {
			String query = "SELECT * FROM \"user\"";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				System.out.print("User Id: " + rs.getInt("userId") + "\t");
				System.out.print("First Name: " + rs.getString("firstName") + "\t");
				System.out.print("Last Name: " + rs.getString("lastName") + "\t");
				System.out.print("Username: " + rs.getString("username") + "\t");
				System.out.print("Phone: " + rs.getString("phone") + "\t");
				System.out.print("Email: " + rs.getString("emailId") + "\t");
				System.out.print("Created On: " + rs.getString("createdOn") + "\t");
				System.out.println();
			}

			st.close();
		} catch (SQLException ex) {
			// handle exception
			System.out.println("Exception:" + ex.getMessage());
		}
	}

	public boolean closeConnection(Connection conn) {
		boolean flag = true;
		try {
			conn.close();
		} catch (SQLException ex) {
			flag = false;
			// handle exception
			System.out.println("Exception:" + ex.getMessage());
		}
		return flag;
	}
}
