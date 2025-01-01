package proxy;

public class MainClass {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeProxyServiceImpl();
		EmployeeDto e1=new EmployeeDto("Piyush");
		try {
			service.create("ADMIN", e1);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			service.delete("ADMIN", e1);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			service.delete("Piyush", e1);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
