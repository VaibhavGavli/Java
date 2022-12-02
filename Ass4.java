import java.sql.*;
import java.util.Scanner;
public class Ass4 {
	public static void main(String[] args) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		Connection con=DriverManager.getConnection(url,"system","System");
		//PreparedStatement psmt=con.prepareStatement("insert into student values(?,?)");
		int no;
		System.out.println("Enter Department Id ");
		Scanner sc=new Scanner(System.in);;
		no=sc.nextInt();
		PreparedStatement ps=con.prepareStatement("select *from emp where deptno=?");
		ps.setInt(1, no);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			while(rs.next())
			{
				System.out.println("\t"+rs.getInt("Empno")+"\t"+rs.getString("ename")+rs.getDouble("Sal"));
			}
		}
		else
			System.out.println(" Record Not Available");
		
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	}
}
