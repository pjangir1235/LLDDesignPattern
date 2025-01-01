package proxy;

public interface  EmployeeService {
	public void create(String user, EmployeeDto dto) throws Exception;
	public void delete(String user, EmployeeDto dto) throws Exception;
	
}
