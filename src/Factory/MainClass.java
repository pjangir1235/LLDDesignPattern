package Factory;

public class MainClass {
	public static void main(String[] args) {

		new ShapeFactory().getShape("Circle").draw();
	}
}
