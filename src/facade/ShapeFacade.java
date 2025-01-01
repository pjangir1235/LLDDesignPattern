package facade;

public class ShapeFacade {
	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeFacade() {
		circle = (Shape) new CircleShapeImpl();
		rectangle = (Shape) new RectangleShapeImpl();
		square = (Shape) new SquareShapeImpl();
	}

	public void drawCircle() {
		circle.draw();
	}
	public void drawRectangle() {
		rectangle.draw();
	}
	public void drawSquare() {
		square.draw();
	}

}
