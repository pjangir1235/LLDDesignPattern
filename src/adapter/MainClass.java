package adapter;

public class MainClass {
	public static void main(String[] args) {
		SocketAdapter s1=new SocketAdapterImpl();
		System.out.println(s1.get120V().getVolts());
		SocketAdapter s2=new SocketAdapterImpl();
		System.out.println(s2.get12V().getVolts());
		System.out.println(s2.get3V().getVolts());
	}
}
