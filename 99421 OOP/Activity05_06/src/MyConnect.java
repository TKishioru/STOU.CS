import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnect {

	public static Connection getConnection() {
		try {
			Class.forName(com.mysql.jdbc.Driver.class.getName());
			return DriverManager.getConnection("jdbc:mysql://localhost/customer","root","123456789");
		}
		catch(ClassNotFoundException e){
			//System.out.println("ERROR");
			e.printStackTrace();
		}
		catch(SQLException e){
			//System.out.println("ERROR");
			e.printStackTrace();
		}
		return null;
	}
}
