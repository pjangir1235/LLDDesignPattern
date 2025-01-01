package builder;

public class MainClass {
	public static void main(String[] args) {
		Computer c1=new ComputerBuilder(8, 512).isBluetooth(true).build();
		Computer c2=new ComputerBuilder(8, 512).isBluetooth(true).isGraphic(true).build();
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
