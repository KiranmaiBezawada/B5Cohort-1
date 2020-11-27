package com.wellsfargo.pms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DatabaseMetaData;
public class test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver  loaded!");
		}catch(ClassNotFoundException exception) {
			System.out.println("Driver not loaded!");
			System.exit(0);
		}		
		
		try(Connection con = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/elm", "root", "root")){
			System.out.println("Connected!");
			
			DatabaseMetaData dbmd = con.getMetaData();
			
			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getDriverVersion());
					
			
			PreparedStatement pt = con.prepareStatement("INSERT INTO user values(?,?,?)");

			System.out.println("username: ");
			pt.setString(1,scan.next());
			System.out.println("password: ");
			pt.setString(2, scan.next());
			System.out.println("user_id: ");
			pt.setDouble(3, scan.nextDouble());
			
			int rowsEffected = pt.executeUpdate();
			
			System.out.println(rowsEffected + " records inserted!" );
						
			PreparedStatement pt2 = con.prepareStatement("SELECT * FROM user");
			ResultSet rs = pt2.executeQuery();
			while(rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3)
						);
			}
		}catch(SQLException exception) {
			System.out.println(exception.getMessage());
		}

}}
