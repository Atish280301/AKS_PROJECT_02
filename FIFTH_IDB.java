import java.sql.*;
public class FIFTH_IDB {
	
	private static final String url = "jdbc:mysql://127.0.0.1:3306";//jdbc:mysql://127.0.0.1:3306
	private static final String user = "root";
	private static final String pass = "";
	

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();
			
			try
			{
				System.out.println("CREATE A DATABASE FIFTHINTERNSHIPPROJECT");
				st.executeUpdate("create database FIFTHINTERNSHIPPROJECT ;");
			}
			catch(SQLException s1)
			{
				System.out.println("SQLException :"+s1.getMessage());
			}
			
			try
			{
				System.out.println("USE FIFTHINTERNSHIPPROJECT DATABASE");
				st.executeUpdate("use FIFTHINTERNSHIPPROJECT ;");
			}
			catch(SQLException s2)
			{
				System.out.println("SQLException :"+s2.getMessage());
			}
			
			try
			{
				String table = "create table Studentdbb("
									+"SRoll varchar(20),"
									+"SName varchar(20),"
									+"SBranch varchar(20),"
									+"SPhone varchar(20)"
									+");";
				
				System.out.println("CREATE Studentdbb TABLE");
				st.executeUpdate(table);
			}
			catch(SQLException s3)
			{
				System.out.println("SQLException :"+s3.getMessage());
			}
		}
		catch(Exception E)
		{
			System.out.println("ACCESS DENIED");
			E.printStackTrace();
		}

	}

}
