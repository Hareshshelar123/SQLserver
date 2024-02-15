package com.hello.myproject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
	
@SpringBootApplication 

public class MyProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(MyProject1Application.class, args);
//		 String url = "jdbc:sqlserver://<SQL Server(SQLEXPRESS)><1433>;databaseName=<customer>";
//	        String user = "<sa>";
//	        String password = "<Haresh1999>";
//
//	        try (Connection conn = DriverManager.getConnection(url, user, password)) {
//	            System.out.println("Connected to SQL Server.");
//	        } catch (SQLException e) {
//	            System.err.println("Failed to connect to SQL Server: " + e.getMessage());
//	        }
	    }		
	

}
