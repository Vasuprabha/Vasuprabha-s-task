package Jdbc;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Connjdbc {
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
// This is for table1			
			Statement stmt = con.createStatement();
			String result1 = "insert into VASU_USERTABLE values(1,'Prabha')";
			String result2 = "insert into VASU_USERTABLE values(2,'Anitha')";
			String result3 = "insert into VASU_USERTABLE values(3,'Anu')";
			String result4 = "insert into VASU_USERTABLE values(4,'Ramya')";
			String result5 = "insert into VASU_USERTABLE values(5,'Keerthana')";
			stmt.addBatch(result1);
			stmt.addBatch(result2);
			stmt.addBatch(result3);
			stmt.addBatch(result4);
			stmt.addBatch(result5);
			stmt.executeBatch();
			ResultSet rs = stmt.executeQuery("select * from VASU_USERTABLE ");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			

// This is for table2	
			Statement stmt2 = con.createStatement();
			String inp1 = "insert into VASU_ACC_INFO values('user1',1,12345,1111)";
			String inp2 = "insert into VASU_ACC_INFO values('user2',2,67890,2222)";
			String inp3 = "insert into VASU_ACC_INFO values('user3',3,112233,3333)";
			String inp4 = "insert into VASU_ACC_INFO values('user4',4,334455,4444)";
		//  String inp5 = "insert into VASU_ACC_INFO values('user5',5,667788,5555)";
			stmt2.addBatch(inp1);
			stmt2.addBatch(inp2);
			stmt2.addBatch(inp3);
			stmt2.addBatch(inp4);
	   //	stmt2.addBatch(inp5);
			stmt2.executeBatch();
			int result= stmt.executeUpdate("delete from VASU_ACC_INFO where USER_ID=5");
			ResultSet rs2 = stmt2.executeQuery("select * from VASU_ACC_INFO ");
			String inp5 = "insert into VASU_ACC_INFO values('user5',5,667788,5555)";
			stmt2.addBatch(inp5);
			while (rs2.next()) {
				System.out.println(rs2.getString(1) + " " + rs2.getInt(2)+" "+ rs2.getInt(3)+" "+ rs2.getInt(4)+" ");
			}

// This is for table 3
			
			Statement stmt3 = con.createStatement();
			String input1 = "insert into VASU_BANKDETAILS values('bankid1',1,'KVB Bank',12345,1000)";
			String input2 = "insert into VASU_BANKDETAILS values('bankid1',7,'IOB Bank',12334,15000)";
			String input3 = "insert into VASU_BANKDETAILS values('bankid2',2,'SBI Bank',67890,10000)";
			String input4 = "insert into VASU_BANKDETAILS values('bankid3',3,'HDFC Bank',112233,2500)";
			String input5 = "insert into VASU_BANKDETAILS values('bankid3',5,'SBI Bank',667788,18000)";
			stmt3.addBatch(input1);
			stmt3.addBatch(input2);
			stmt3.addBatch(input3);
			stmt3.addBatch(input4);
			stmt3.addBatch(input5);
			stmt3.executeBatch();
			ResultSet rs3 = stmt3.executeQuery("select * from VASU_BANKDETAILS ");
			while (rs3.next()) {
				System.out.println(rs3.getString(1) + " " + rs3.getInt(2) + " " + rs3.getString(3) + " "+ rs3.getInt(4) + " "+ rs3.getInt(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
