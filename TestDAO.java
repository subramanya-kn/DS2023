package dao;

public class TestDAO {

	


	public static void main(String[] args) {

		EmployeeDAOImpl empDaoImpl = new EmployeeDAOImpl();
	
		Employee employee = new Employee();
		employee.setEmployeeNumber(104);
		employee.setEmployeeName("Robert");
		employee.setEmployeeJob("Clerk");
		employee.setEmployeeSalary(6000);
		
		empDaoImpl.addEmployee(employee);
		
	}

}
