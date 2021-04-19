package week2;
import java.awt.*;
import acm.graphics.*;
import java.awt.event.MouseEvent;

import acm.program.GraphicsProgram;

public class DrawingLines<Gline> extends GraphicsProgram {
//public class DrawingLines extends GraphicsProgram {
	double startX;
	double startY;
	double endX;		
	double endY;
	GLine cline = new GLine(startX,startY,endX,endY);
	
	public void run(){
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		startX = e.getX();
		startY = e.getY();
		cline.setEndPoint(startX, startY);
		cline.setStartPoint(startX,startY);
		add(cline);
	}

	public void mouseDragged(MouseEvent e) {
		endX = e.getX();
		endY = e.getY();
		cline.setEndPoint(endX,endY);
	}
	public void mouseReleased(MouseEvent e) {
		endX = e.getX();
		endY = e.getY();
		cline.setEndPoint(endX,endY);
		GLine cline = new GLine(startX,startY,endX,endY);
		add(cline);
	}
}	
