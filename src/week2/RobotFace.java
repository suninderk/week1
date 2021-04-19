package week2;

import java.awt.Color;
import acm.graphics.*;
import acm.program.*;
//import org.meritamerica.squadb.examples.GOval;
//import org.meritamerica.squadb.examples.GRect;
import acm.program.GraphicsProgram;

public class RobotFace extends GraphicsProgram {
	public void run(){
		final int HEAD_WIDTH=500;
		final int HEAD_HEIGHT=700;
		GRect rect1=new GRect (570,200,HEAD_WIDTH,HEAD_HEIGHT);
		rect1.setFilled(true);
		rect1.setFillColor(Color.GRAY);
		add(rect1);
		final int EYE_RADIUS=36;
		GOval oval1= new GOval (670,300,EYE_RADIUS*2, EYE_RADIUS*2);
		oval1.setFilled(true);
		oval1.setFillColor(Color.YELLOW);
		add(oval1);

		GOval oval2= new GOval (890,300, EYE_RADIUS*2, EYE_RADIUS*2);
		oval2.setFilled(true);
		oval2.setFillColor(Color.YELLOW);
		add(oval2);
		final int MOUTH_WIDTH=300;
		final int MOUTH_HEIGHT=110;
		GRect rect2 = new GRect(670,660,MOUTH_WIDTH,MOUTH_HEIGHT);
		rect2.setFilled(true);
		rect2.setFillColor(Color.WHITE);
		add(rect2);
		}
}
