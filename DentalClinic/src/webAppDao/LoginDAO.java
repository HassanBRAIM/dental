package webAppDao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDAO {
	private String dbdriver="com.mysql.jdbc.Driver";

	 public static void loadDriver(String dbDriver) {
			try {
				Class.forName(dbDriver);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	  
		public static  Connection getConnection() {
			Connection con=null;
			
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
		}
		
		public boolean LoginCheck(String Username,String Password) {
			loadDriver(dbdriver);
			Connection con=getConnection();
			String sql="select * from patient_account where username=? and password=?";
			try {
				PreparedStatement st=con.prepareStatement(sql);
				st.setString(1, Username);
				st.setString(2, Password);
				ResultSet rs=st.executeQuery();
				if(rs.next()) { 
					return true;
				}
				System.out.println("Good");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return false;
			
		}

}
