package com.bptn.course.week6._jdbc_postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TodoListClass {
	private static final String username = "postgres";
	private static final String password = "pg123";
	private static final String dbName = "todolist";
	private static final String port = "5432";
	private static final String dbUrl = "localhost";

	public Connection createConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName, username,
					password);
		} catch (SQLException e) {
			System.out.println(e.getClass().getName() + ":" + e.getMessage());
			System.exit(0);
		}

		System.out.println("Connected to DB!");
		return con;
	}

	public void getAllUsers(Connection con) {
		try {
			// Step 1 - Create a statement
			Statement st = con.createStatement();
			// Step 2 - Define the Query
			String query = "SELECT * FROM users";
			// Step 3 - Execute the Query and store the result
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				System.out.print("User Id: " + rs.getInt("userId") + "\t");
				System.out.print("User Name: " + rs.getString("username") + "\t");
				System.out.print("Email: " + rs.getString("email") + "\t");
				System.out.print("Created At: " + rs.getString("createdAt") + "\t");
				System.out.println();
			}
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getTaskByDate(Connection conn, String dueDate) {
		try {
			Statement myStatement = conn.createStatement();
			String myQuery = "SELECT * FROM tasks WHERE \"dueDate\" = " + "'" + dueDate + "'";
			ResultSet rs = myStatement.executeQuery(myQuery);
			while (rs.next()) {
				System.out.print("Task Description: " + rs.getString("taskDescription"));
				System.out.println();
			}
			myStatement.close();
		} catch (SQLException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

	public boolean closeConnection(Connection con) {
		boolean flag = true;

		try {
			con.close();
		} catch (SQLException e) {
			flag = false;
			System.out.println("Exception: " + e.getMessage());
			System.exit(0);
		}

		System.out.println("Connection closed!");
		return flag;
	}
}
