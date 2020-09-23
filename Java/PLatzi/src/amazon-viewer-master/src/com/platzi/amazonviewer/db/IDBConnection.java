package com.platzi.amazonviewer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import static com.platzi.amazonviewer.db.DataBase.*;

public interface IDBConnection {
	
	@SuppressWarnings("finally")
	default Connection connectToDB() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL + DB, USER, PASSWORD);
			if (connection != null) {
				System.out.println("¡Conexión Exitosa a la BD!");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			return connection;
		}
	}
}