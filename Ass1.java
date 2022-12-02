
import java.sql.*;
// download jar file
// create project project
// configure build path-- add that external jar

public class Ass1 {
	public static void main(String[] args) {
		try {
			// Step-1 load drive class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url,username,password;
			username="system";
			password="system";
			url="jdbc:oracle:thin:@localhost:1521:XE";
			// step 2 establish connection
			
			Connection con=DriverManager.getConnection(url,username,password);
		    System.out.println("Connection Available ");
		}
		catch(ClassNotFoundException | SQLException e)
		{
		System.out.println(e);
		}
	}

}
