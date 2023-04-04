package javaTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemoDelete {
	
	public static void main(String[] args) {
		String username = "root";
		String password = "pallavi@123";
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String query = "delete from car where id = 1";
		Connection connection = null;
		
		try {
			//loading drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establishing connection
			connection = DriverManager.getConnection(url,username,password);
			
			//creating a statement
			Statement statement = connection.createStatement();
			
			//executing statement ; 
			int i = statement.executeUpdate(query);
			if(i > 0)
			System.out.println("1 row deleted");
			
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
