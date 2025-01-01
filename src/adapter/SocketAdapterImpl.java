package adapter;

public class SocketAdapterImpl  implements SocketAdapter{
	
	Socket socket = new Socket();

	@Override
	public Volt get120V() {
		return socket.getVolt();
	}

	@Override
	public Volt get12V() {
		Volt v = socket.getVolt();
		return convertVolt(v.getVolts(), 10);
	}

	@Override
	public Volt get3V() {
		Volt v = socket.getVolt();
		return convertVolt(v.getVolts(), 40);
	}
	public Volt convertVolt(int v, int i) {
		return new Volt(v/i);
	}

}
