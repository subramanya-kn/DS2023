package dao;

import java.util.List;

public class TestDAO {

	


	public static void main(String[] args) {

		EmployeeDAOImpl empDaoImpl = new EmployeeDAOImpl();
	
		List<Employee> empList = empDaoImpl.getEmployees();
		
		for (Employee employee : empList) {
			System.out.println("Emp : "+employee);
		}
		/*Employee employee = new Employee();
		employee.setEmployeeNumber(104);
		employee.setEmployeeName("Robert");
		employee.setEmployeeJob("Clerk");
		employee.setEmployeeSalary(6000);
		
		empDaoImpl.addEmployee(employee);*/
		
	}

}
