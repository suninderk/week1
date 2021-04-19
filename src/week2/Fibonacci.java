package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	int a=0;
	int b=1;
	public void run(){
		System.out.println(a);
		System.out.println(b);
	int temp=a+b;
	System.out.println(temp);
	while (temp<10000){
		a=b;
		b=temp;
		temp=a+b;
			if (temp<10000){
		System.out.println(temp);
			}
		}
	}
}



