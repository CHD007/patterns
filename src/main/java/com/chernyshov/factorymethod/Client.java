package com.chernyshov.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private List<Shape> shapes;
	public Client() {
		this.shapes = new ArrayList<Shape>();
	}
	public void readShapes(String[] shapesAsText) {
		// let's move this!!!
		for (String shapeAsText : shapesAsText) {
			this.shapes.add(Shape.create(shapeAsText));
		}
	}
	public void drawAllShapes() {
		for (Shape s : this.shapes) {
			s.draw();
		}
	}
}
