package com.chernyshov.decorator;

public interface GraphicalComponent {
	public void paint();
	public GraphicalComponent addContent(Object content);
}
