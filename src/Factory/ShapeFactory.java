package Factory;

public class ShapeFactory {
	Shape shape;

	public Shape getShape(String shapeType) {
		shapeType = shapeType.toLowerCase();
		switch (shapeType) {
		case "circle":
			shape = new Circle();
			break;
		case "rectangle":
			shape = new Rectangle();
			break;
		default:
			shape = new Rectangle();

		}
		return shape;
	}

} 
