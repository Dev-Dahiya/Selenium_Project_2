package exceptionhandling;

import java.sql.*;

public class Account {
	String url = "jdbc:mysql://localhost:3306/";
	String user = "abc";
	String password = "code";
	public Connection getConn() throws SQLException{
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	public void withraw(int amount) throws SQLException{
		getConn();
	}

}
