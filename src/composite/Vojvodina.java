package composite;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import mvc.Shape;

public class Vojvodina extends Shape {
	ArrayList<Shape> vojvodina = new ArrayList<Shape>();
	
	public void add(Shape s) {
		vojvodina.add(s);
	}
	
	public void remove(Shape s) {
		vojvodina.remove(s);
	}

	@Override
	public void draw(Graphics g) {
		Iterator<Shape> it = vojvodina.iterator();
		while(it.hasNext())
			it.next().draw(g);	
	}

}
