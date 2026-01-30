package prototype;

import java.awt.Color;

import mvc.Point;

public class TestPrototype {

	public static void main(String[] args) {
		// 1. način - shallow copy
		Point p1 = new Point(10, 10, Color.BLACK);
		Point p2 = new Point(20, 20, Color.BLACK);
		
		LineShallow line = new LineShallow(p1, p2, Color.BLACK);
		LineShallow lineClone = line.clone();
		
		System.out.println(line);
		System.out.println(lineClone);
		
		line.getStartPoint().setX(55);
		System.out.println(lineClone.getStartPoint().getX()); //---> 55
		
		
		// 2. način - deep copy
		Point p3 = new Point(40, 60, Color.BLACK);
		Point p4 = new Point(70, 90, Color.BLACK);
		
		LineDeep line2 = new LineDeep(p3, p4, Color.BLACK);
		LineDeep lineClone2 = line2.clone();
		
		line2.getStartPoint().setX(789);
		System.out.println(lineClone2.getStartPoint().getX()); //---> 40
		
		

	}

}
