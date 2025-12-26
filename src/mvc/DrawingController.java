package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import command.AddPointCmd;
import composite.Vojvodina;

public class DrawingController {
	
	DrawingModel model;
	DrawingFrame frame;
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}

	public void mouseClicked(MouseEvent e) {
		/* Testiranje MVC i Command obrasca
		Point p = new Point(e.getX(), e.getY(), Color.RED);
		//model.add(p);
		AddPointCmd addPointCmd = new AddPointCmd(model, p);
		addPointCmd.execute();	
		//undoStack.add(addPointCmd);
		
		frame.repaint();
		*/
		
		// Testiranje Composite obrasca
		Point backa = new Point(e.getX(), e.getY(), Color.BLUE);
		Point srem = new Point(e.getX()+10, e.getY(), Color.BLUE);
		Point banat = new Point(e.getX()+5, e.getY()-8, Color.BLUE);
		
		Vojvodina vojvodina = new Vojvodina();
		vojvodina.add(backa);
		vojvodina.add(srem);
		vojvodina.add(banat);
		
		model.add(vojvodina);
		frame.repaint();
	}


}
