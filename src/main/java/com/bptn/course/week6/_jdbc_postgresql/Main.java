package com.bptn.course.week6._jdbc_postgresql;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		TodoListClass jdbc = new TodoListClass();
		Connection con = jdbc.createConnection();
		jdbc.getAllUsers(con);
		jdbc.getTaskByDate(con, "2024-10-29");
		jdbc.closeConnection(con);
	}
}
