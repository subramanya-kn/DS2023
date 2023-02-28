package dao;

import java.util.List;

public interface EmployeeDAO { //POJI
	void 		   addEmployee(Employee e);   //C-create
	List<Employee> getEmployees();			  //R-read/all
	Employee       getEmployee(int empno);    //R-read/single
	void 		   updateEmployee(Employee e);//U-update
	void 		   deleteEmployee(int empno); //D-delete
}
