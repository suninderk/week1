package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
			
			/*solve a Karel problem that involves stepwise refinement
			Write a Karel program to clean the chad from a ballot. +/
			 
			 */
			while (frontIsClear()){
						move();
			/*checking if beeper is present,
			if yes then move forward to next column to check next ballot vote
			*/
			 if (beepersPresent()){
				 	move();
				 }else{
		/* if no beeper present, means voted, so check up and down to clear any beeper there
		 * */
		 
					turnLeft();
					move();
					while(beepersPresent()){
						pickBeeper();
						}
					turnAround();
					move();
					move();
					while(beepersPresent()){
						pickBeeper();
						}
					turnAround();
					move();
					turnRight();
					move();
				 }
			}
		}
				
	}
	
		

