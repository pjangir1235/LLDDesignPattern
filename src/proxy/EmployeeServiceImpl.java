package proxy;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void create(String user, EmployeeDto dto) {
		System.out.println("User "+dto.name+" Create by "+user);

	}

	@Override
	public void delete(String user, EmployeeDto dto) {
		System.out.println("User "+dto.name+" Delete by "+user);

	}

}
