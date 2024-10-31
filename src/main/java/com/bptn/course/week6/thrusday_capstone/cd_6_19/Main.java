package com.bptn.course.week6.thrusday_capstone.cd_6_19;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		WeatherAppUserInsertion jdbc = new WeatherAppUserInsertion();
		Connection conn = jdbc.createConnection();

		jdbc.addUser(conn, "Ray", "Mist", "raymist", "18292831", "ray@mist.com", "Ray@22", true);
		jdbc.closeConnection(conn);
	}

}