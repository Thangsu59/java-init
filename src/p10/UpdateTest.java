package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {

	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			 
			e.printStackTrace();
		}
		try {
			Connection con=DriverManager.getConnection("jdbc:mariadb://localhost:3307/kd","root","kd1824java");
			String sql="UPDATE user_info\r\n"
					+ "SET UI_NAME='동이'\r\n"
					+ "WHERE UI_NUM=8;";
			Statement stmt=con.createStatement();
			int resultCnt=stmt.executeUpdate(sql);  
			System.out.println("반영된 행갯수 : "+resultCnt);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
