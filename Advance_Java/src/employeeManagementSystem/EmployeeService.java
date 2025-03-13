package employeeManagementSystem;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeService {
	
	void addEmployee(Employee employee) throws SQLException;
	List<Employee> fetchEmployee() throws SQLException;
	boolean updateEmployee(int id) throws SQLException;
	boolean deleteEmployee(int id) throws SQLException;
	void addAdmin(Admin admin) throws SQLException;
	List<Admin> fetchAdmin() ;

}
