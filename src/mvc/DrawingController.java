package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

public class DrawingController {
	DrawingModel model;
	DrawingFrame frame;
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}

	public void drawPoint(MouseEvent e) {
		Point p1 = new Point(e.getX(), e.getY(), Color.BLACK);
		model.add(p1);
		frame.repaint();
		
	}

}
