package Jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sp {
	public static void main(String[] args) {
		String sql ="call VASU_WITHDRAW_AMOUNT()";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:sqlserver://192.168.168.12:1433;databaseName=New_joinee_2022", "NewJoinee2022", "P@ssw0rd");
			
			CallableStatement call = con.prepareCall(sql);
			
			
     		Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select VASU_USERTABLE.USER_ID,VASU_USERTABLE.USER_NAME,VASU_BANKDETAILS.BANK_USERID, VASU_BANKDETAILS.BANK_NAME, VASU_BANKDETAILS.AMOUNT \r\n"
					+ "from VASU_USERTABLE inner join VASU_BANKDETAILS on VASU_USERTABLE.USER_ID=VASU_BANKDETAILS.USER_ID ");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " "+ rs.getString(2)+" " + rs.getString(3) + " "+ rs.getString(4) 
				+ " "+ rs.getInt(5));
			}	
	} catch (Exception e) {
		e.printStackTrace();
	}
		

}
	}
