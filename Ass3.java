import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ass3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Statement smt=null;
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	Connection con=DriverManager.getConnection(url,"system","system");
	int rno=67;
	String name="Deepa";
	// insert into student values(67,'Deepa');
	
	String str="insert into student values("+rno+",'"+name+"')";
	System.out.println(str);
	smt=con.createStatement();
	int no=smt.executeUpdate(str);
	System.out.println(no+" record Inserted ");
	
	
	//ResultSet rs=smt.executeQuery("Select *from student");
	//while(rs.next())
	//{
		//System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2));
	//}
	//}
	}
}
