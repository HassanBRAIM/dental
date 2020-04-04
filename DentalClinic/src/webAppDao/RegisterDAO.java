package webAppDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import webAppModel.User;

public class RegisterDAO {
	//private String dburl="jdbc:mysql://localhost:3306/user";
	//private String dbuname="root";
	//private String dbpassword="";
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
		
		public String insert(User user) {
			loadDriver(dbdriver);
			Connection con=getConnection();
			String res="Data entered succufuly";
			String sql="insert into user.patient_account values(?,?,?,?,?,?)";
			try {
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, user.getFirstname());
				ps.setString(2, user.getLastname());
				ps.setString(3, user.getUsername());
				ps.setString(4, user.getEmail());
				ps.setString(5, user.getPassword());
				ps.setString(6, user.getPhone());
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				res="Data not entered";
			}
			return res;
			
		}

}
