package composite;

import java.util.ArrayList;
import java.util.List;

public class DrawingComposite implements Shape {
	List<Shape> shape = new ArrayList<>();

	@Override
	public void draw(String color) {
		shape.forEach(s -> s.draw(color));
	}

	public void add(Shape shape) {
		this.shape.add(shape);
	}

	public void remove(Shape shape) {
		this.shape.remove(shape);
	}

	public void clear() {
		this.shape.clear();
	}
}
