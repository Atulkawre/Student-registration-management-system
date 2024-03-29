package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	
	public static Connection provideconnection() {
		Connection con= null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/automatedStudentRegistration", "root", "Atul@2002");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
