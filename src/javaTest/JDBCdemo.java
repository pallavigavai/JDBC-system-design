package javaTest;

import java.sql.*;

public class JDBCdemo {

	public static void main(String[] args) {
		String username = "root";
		String password = "pallavi@123";
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String query = "insert into car values(2,'Swift', 'Maruti' )";
		Connection connection = null;
		
		try {
			//loading drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establishing connection
			connection = DriverManager.getConnection(url,username,password);
			
			//creating a statement
			Statement statement = connection.createStatement();
			
			//executing statement ; 
			statement.execute(query);
			System.out.println("query executed");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//closing connection
			
			try {
				connection.close();
				System.out.println("connection closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
