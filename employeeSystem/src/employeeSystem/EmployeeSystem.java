package employeeSystem;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeSystem {
	
	void createdatabse() throws SQLException;
	void addEmployee(Employee employee) throws SQLException;
	List<Employee> viewEmployee() throws SQLException;
	boolean removeEmployeeById(int id) throws SQLException;
	boolean updateEmployee(String department ) throws SQLException;

}
