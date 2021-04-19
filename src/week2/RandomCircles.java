package week2;
import acm.util.*;
import acm.program.GraphicsProgram;
import java.util.*;
import acm.graphics.*;
import java.awt.*;
public class RandomCircles extends GraphicsProgram {
	private int upperVal=50;
	private int lowerVal=5;

	public void run(){
		int h = getHeight();
		int w = getWidth();
		
		System.out.println("Height " + h + "Width " + w);
		int mycount = 1;
		while (mycount<11) {
			RandomGenerator rand = new RandomGenerator();
				
			int xCircle =rand.nextInt(w);  // x 
			int yCircle =rand.nextInt(h);  // y

			int radius = rand.nextInt(upperVal-lowerVal) + lowerVal;
			
			if (((xCircle + (2*radius))< w) && ((yCircle+(2*radius))< h ) ) {	
//				System.out.println("Radius  : " + radius + " Y " + yCircle + " y plane : " + (yCircle + (2*radius)));
//				System.out.println("Y " + yCircle + " X plane : " + (yCircle+(2*radius)));
				GOval drawCir =new GOval(xCircle, yCircle, radius*2 , radius*2 );
				if (drawCir!=null){
					drawCir.setFilled(true);
					drawCir.setFillColor(rand.nextColor());
					add(drawCir);
					mycount++;
				}	
			}
		}
	}
}

	
