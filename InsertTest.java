import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Inserttest {
	public static void main(String[] args) {
		try {
			System.out.println("Trying to load the driver...");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("1. driver...loaded");
			
			System.out.println("Trying to connect to the DB...");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", "root123");
			System.out.println("2. Connected to the DB :" + conn);
			
			PreparedStatement pst = conn.prepareStatement("insert into employee values (?,?,?,?)");
			System.out.println("3. PreparedStatement created....");

			pst.setInt(1, 120);
			pst.setString(2, "Smith");
			pst.setString(3, "President");
			pst.setInt(4, 9999);
			
			int rows = pst.executeUpdate(); //run the insert query
			
			System.out.println("4. executed the insert query : "+rows+ " row(s) inserted");

			System.out.println("6. db resources closed....");
			pst.close();
			conn.close();
			System.out.println("DB resources are closed...");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}