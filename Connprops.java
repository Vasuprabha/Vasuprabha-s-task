package Jdbc;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Connprops {
//	System.out.println("create jdbc connection using properties file");

	public static Properties loadPropertiesFile() throws Exception {

		Properties prop = new Properties();
		InputStream in = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\15_September\\lib\\db.properties");
		prop.load(in);
		in.close();
		return prop;
	}

	public static void main(String[] args) {
		Connection con = null;

		try {

			Properties prop = loadPropertiesFile();

			String driverClass = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");

			Class.forName(driverClass);

			con = DriverManager.getConnection(url, username, password);
			String sql ="call VASU_WITHDRAW_AMOUNT()";
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

