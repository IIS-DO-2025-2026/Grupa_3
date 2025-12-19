package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import command.AddPointCmd;

public class DrawingController {
	
	DrawingModel model;
	DrawingFrame frame;
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}

	public void mouseClicked(MouseEvent e) {
		Point p = new Point(e.getX(), e.getY(), Color.RED);
		//model.add(p);
		AddPointCmd addPointCmd = new AddPointCmd(model, p);
		addPointCmd.execute();	
		//undoStack.add(addPointCmd);
		
		frame.repaint();
		//System.out.println(System.currentTimeMillis());
	}


}
