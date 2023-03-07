import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {
		try {
			System.out.println("Trying to load the driver...");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("1. driver...loaded");
			
			System.out.println("Trying to connect to the DB...");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", "root123");
			System.out.println("2. Connected to the DB :" + conn);
			
			PreparedStatement pst = conn.prepareStatement("delete from employee where empno=?");
			System.out.println("3. PreparedStatement created....");

		
			pst.setInt(4, 120);

			int rows = pst.executeUpdate(); //run the insert query
			
			System.out.println("4. executed the delete query : "+rows+ " row(s) deleted");

			System.out.println("5. db resources closed....");
			pst.close();
			conn.close();
			System.out.println("DB resources are closed...");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}