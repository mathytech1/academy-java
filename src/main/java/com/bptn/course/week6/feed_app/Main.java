package com.bptn.course.week6.feed_app;

import java.sql.Connection;

public class Main {
	public static void main(String[] args) {
		FeedAppClass jdbc = new FeedAppClass();
		Connection conn = jdbc.createConnection();
//		jdbc.addUser(conn, "Ray", "Mist", "raymist", "18292831", "ray@mist.com", "Ray@22", true);
		jdbc.getAllUsers(conn);
		jdbc.closeConnection(conn);
	}
}
