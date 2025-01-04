package composite;

public class MainClass {

	public static void main(String[] args) {
		Shape c1 = new Circle();
		Shape c2 = new Circle();
		Shape s1 = new Square();
		Shape s2 = new Square();

		DrawingComposite drawing = new DrawingComposite();

		drawing.add(c1);
		drawing.add(s1);
		drawing.add(s2);
		drawing.draw("Red");
		
		drawing.clear();
		
		drawing.add(c2);
		drawing.add(s2);
		
		drawing.draw("Yellow");
		
	}

}
