package week1;
/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	
	public void run() {
		
		// solve a Karel problem that involves stepwise refinement
		/* Write a Karel program to clean the chad from a ballot. +/
		 * 
		 */
		while (frontIsClear() ){
					move();
		/*checking if beeper is present,
		if yes then move forward to next column to check next ballot vote
		*/
		 if (beepersPresent()){
		move();
		}
	/* if no beeper present, means voted, so check up and down to clear any beeper there
	 * */
		if(noBeepersPresent()){
					turnLeft();
					move();
						if(beepersPresent()){
		pickBeeper();
		}
		turnAround();
		move();
		move();
		if(beepersPresent()){
		pickBeeper();
		}
		turnAround();
		move();
		}
		turnRight();
		move();


		}
		}
		

	
	}


