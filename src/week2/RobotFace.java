package week2;

import java.awt.Color;
import acm.graphics.*;
import acm.program.*;
//import org.meritamerica.squadb.examples.GOval;
//import org.meritamerica.squadb.examples.GRect;
import acm.program.GraphicsProgram;

public class RobotFace extends GraphicsProgram {
	public void run(){
		int x=570;
		int y=200;
		final double HEAD_WIDTH=500.0;
		final double HEAD_HEIGHT=700.0;
		GRect rect1=new GRect (x,y,HEAD_WIDTH,HEAD_HEIGHT);
		rect1.setFilled(true);
		rect1.setFillColor(Color.GRAY);
		add(rect1);
		/*The centers of the eyes should be set horizontally a quarter of the width of the head in from either edge, 
		 and one quarter of the distance down from the top of the head.*/
		final int EYE_RADIUS=37;
		//center of eye= x +( 1/4* HEAD_WIDTH) - EYE_RADIUS
		
		GOval oval1= new GOval (x +( 0.25* HEAD_WIDTH)-EYE_RADIUS, y+( 0.25* HEAD_HEIGHT)-EYE_RADIUS,EYE_RADIUS*2, EYE_RADIUS*2);
		oval1.setFilled(true);
		oval1.setFillColor(Color.yellow);
		add(oval1);

		GOval oval2= new GOval ( (HEAD_WIDTH +x) -( 0.25* HEAD_WIDTH)-(2* EYE_RADIUS), y+( 0.25* HEAD_HEIGHT)-EYE_RADIUS, EYE_RADIUS*2, EYE_RADIUS*2);
		oval2.setFilled(true);
		oval2.setFillColor(Color.YELLOW);
		add(oval2);
		/*The mouth should be centered with respect to the head in the x-dimension
		and one quarter of the distance up from the bottom of the head in the y-dimension. */
		final int MOUTH_WIDTH=300;
		final int MOUTH_HEIGHT=110;
		/*y co-ordinate of mouth means moving up from face a quarter and also the height of mouth 
		 which is 110pixel as y co-ordinate is initial point of starting of rectangle*/
	
		GRect rect2 = new GRect(x+100, y+(HEAD_HEIGHT)-(0.25* HEAD_HEIGHT)-MOUTH_HEIGHT,MOUTH_WIDTH,MOUTH_HEIGHT);
		rect2.setFilled(true);
		rect2.setFillColor(Color.white);
		add(rect2);
		}
	
}
