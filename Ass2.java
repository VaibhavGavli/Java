//PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?)");  
//stmt.setInt(1,101);//1 specifies the first parameter in the query  
//stmt.setString(2,"Ratan");  
import java.sql.*;
// write query to display all record from emp table
public class Ass2 {
	public static void main(String[] args) {
		try {
			// Step-1 load drive class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			// step 2 establish connection
			Connection con=DriverManager.getConnection(url,"system","system");
		    System.out.println("Connection Available ");
		    //Step -3  create statement
		    Statement smt=con.createStatement();
		    //step -4 Execute Query
		    ResultSet rs= smt.executeQuery("select * from emp");
		   
		    while(rs.next())
		    {
		    	System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(6));
		    }
		   
		    
		}
		catch(ClassNotFoundException | SQLException e)
		{
		System.out.println(e);
		}
	}

}
