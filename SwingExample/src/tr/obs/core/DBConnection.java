package tr.obs.core;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public Connection conn = null;

	/**
	 * connect for db
	 * 
	 * @return void
	 * 
	 */
	public void connectDB() {

		try {

			Class.forName("org.postgresql.Driver");

			String username = "postgres";
			String password = "root";
			String url = "jdbc:postgresql://localhost:5432/Javatar";

			conn = DriverManager.getConnection(url, username, password);

			System.out.println("Baðlandý!");

		} catch (Exception e) {

			System.out.println("Error DBconnection :" + e.getMessage());

			// TODO: handle exception
		}

	}

	/**
	 * disconnect for database
	 * 
	 * @return void
	 * 
	 */
	public void disConnect() {
		try {

			conn.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
