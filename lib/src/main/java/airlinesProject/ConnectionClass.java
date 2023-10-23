package airlinesProject;

import java.sql.*;

public class ConnectionClass {
	
	Connection con;
	Statement stm;
	ConnectionClass(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ams", "root", "root");
			stm = con.createStatement();
		}
		catch(Exception ex){
//			ex.printStackTrace();
			System.out.printf("Exception [Err_Msg]: {%s}", ex.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new ConnectionClass();
	}

}
