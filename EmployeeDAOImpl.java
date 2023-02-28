package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
	Connection conn ;
	public EmployeeDAOImpl() {
		try {
			System.out.println("Trying to load the driver...");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("1. driver...loaded");
			System.out.println("Trying to connect to the DB...");
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", "root123");
			System.out.println("2. Connected to the DB :" + conn);
		} catch (SQLException e) {e.printStackTrace();}
	}
	@Override
	public void addEmployee(Employee e) {
		try {
			PreparedStatement pst = conn.prepareStatement("insert into employee values (?,?,?,?)");
			System.out.println("3. PreparedStatement created....");
			pst.setInt(1, e.getEmployeeNumber());
			pst.setString(2, e.getEmployeeName());
			pst.setString(3, e.getEmployeeJob());
			pst.setInt(4, e.getEmployeeSalary());
			
			int rows = pst.executeUpdate(); //run the insert query	
			System.out.println("4. executed the insert query : "+rows+ " row(s) inserted");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(int empno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee(int empno) {
		// TODO Auto-generated method stub

	}

}
