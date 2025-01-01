package proxy;

public class EmployeeProxyServiceImpl implements EmployeeService {
	
	EmployeeService service;
	EmployeeProxyServiceImpl(){
		service=new EmployeeServiceImpl();
	}
	@Override
	public void create(String user, EmployeeDto dto) throws Exception {
		if(user.equals("ADMIN")){
			service.create(user, dto);
			return;
		}
		throw new Exception("Access Denied");

	}

	@Override
	public void delete(String user, EmployeeDto dto) throws Exception {
		if(user.equals("ADMIN")){
			service.delete(user, dto);
			return;
		}

		throw new Exception("Access Denied");

	}

}
