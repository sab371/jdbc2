

import java.sql.*;

public class New {
	public static void main(String args[]) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/test";
		String uname = "newuser";
		String pwd = "password";
		String query = "SELECT * FROM `user_authentication`;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection(url,uname,pwd);
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		System.out.println(rs.getString("username"));
	}
}
