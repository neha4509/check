package com.lti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class JdbcApp1 
{
	Connection con;
	Statement st;
	ResultSet rs;
	
	public JdbcApp1() {
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ose","system","Neha2011");
			st = con.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void getAccountDetails(){
		try {
			rs = st.executeQuery("Select * from accounts");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " " + rs.getString(3)+" "+rs.getInt(4));
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
