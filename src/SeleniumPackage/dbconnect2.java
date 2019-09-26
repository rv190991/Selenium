package SeleniumPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbconnect2 
{

	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		
		
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","mysql");
		
			Statement stmt = conn.createStatement();
		
			ResultSet rs = stmt.executeQuery("select * from emp");
			
			System.out.println("ID\t\tNAME\t\tDEPT\t\tJOINDATE\t\tLASTDATE");
			System.out.println("====\t\t=======\t\t=======\t\t============\t\t============");
		
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getDate(4)+"\t\t"+rs.getDate(5));
			
			}
		
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
