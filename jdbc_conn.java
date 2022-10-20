package sep_23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc_conn {
public static void main(String[]args)
{
	try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection con= DriverManager.getConnection("jdbc:sqlserver://192.168.168.12:1433;databaseName=New_joinee_2022","sa","P@ssw0rd");
		Statement stmt= con.createStatement();
		ResultSet rs= stmt.executeQuery("insert into ebanking values('ZZZZ',896745,40000,'Chennai')");
		
	} catch (Exception e) {
		e.printStackTrace();
 	}
}
}
