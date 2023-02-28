package dao;

import java.util.List;

public class TestDAO {

	


	public static void main(String[] args) {

		EmployeeDAOImpl empDaoImpl = new EmployeeDAOImpl();
	
		//104 | Robert | Clerk   | 6000 |
		Employee employee = new Employee();
		employee.setEmployeeName("ROBERT");
		employee.setEmployeeJob("PRESIDENT");
		employee.setEmployeeSalary(9999);
		
		employee.setEmployeeNumber(104);
		
		empDaoImpl.updateEmployee(employee);
		/*List<Employee> empList = empDaoImpl.getEmployees();
		
		for (Employee employee : empList) {
			System.out.println("Emp : "+employee);
		}*/
		
		/*Employee employee = new Employee();
		employee.setEmployeeNumber(104);
		employee.setEmployeeName("Robert");
		employee.setEmployeeJob("Clerk");
		employee.setEmployeeSalary(6000);
		
		empDaoImpl.addEmployee(employee);*/
		
	}

}
