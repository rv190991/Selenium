package SeleniumPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbconnect 
{

	public static void main(String[] args) 
	{
		Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try 
        {
        	 
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(Exception e) 
        {
 
            System.out.println("Problem in loading or " + "registering MS Access JDBC driver");
            e.printStackTrace();
        }
        
        try 
        {
        	 
            String msAccDB = "D:\\Ravi\\Selenium class\\EMP.accdb";
            String dbURL = "jdbc:ucanaccess://" + msAccDB;
            
            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            
            resultSet = statement.executeQuery("SELECT * FROM EMP");
            
            System.out.println("ID\tName\t\t\tDepartment\tActive");
            System.out.println("==\t=======\t\t\t============\t=======");
 
            // processing returned data and printing into console
            while(resultSet.next()) {
                System.out.println(resultSet.getInt(1) + "\t" + 
                        resultSet.getString(2) + "\t\t" + 
                        resultSet.getString(3) + "\t" +
                        resultSet.getString(4));
            }
        }
        catch(SQLException sqlex){
            sqlex.printStackTrace();
        }
        finally {
            // Step 3: Closing database connection
            try {
                if(null != connection) {
                    // cleanup resources, once after processing
                    resultSet.close();
                    statement.close();
 
                    // and then finally close connection
                    connection.close();
                }
            }
            catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
            
        

	}

}
