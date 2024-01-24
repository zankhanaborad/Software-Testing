package Basic;

import java.util.Scanner;

public class Practical2 {
	//Take three numbers from the user and print the greatest
	//number.

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Value Of A =" );
	int A = sc.nextInt();
	
	System.out.println("Value Of B =" );
	int B = sc.nextInt();
	
	System.out.println("Value Of C =" );
	int C = sc.nextInt();
	
	if(A>B && A>C)
		System.out.println("The greatest number is :" +A);
	if(B>A && B>C)
		System.out.println("The greatest number is :" +B);
	if(C>A && C>B)
		System.out.println("The greatest number is :" +C);
	
	
	
	
	
	//a program user enter the 5 subjects mark. You have to make a total and
	//find the percentage.
	
	
	
	System.out.println("enter marks = ");
	int m = sc.nextInt();
	if (m < 35) {
		System.out.println("fail");
	} else if (m > 35 && m <= 50) {
		System.out.println("Pass Class");
	} else if (m >50 && m <= 60) {
		System.out.println("Second Class");
	} else if (m > 60 && m <= 75) {
		System.out.println("First Class");
	} else if (m >75) {
		System.out.println("Distinction");
	} else {
		System.out.println("invalid input");
	}
		
	
		
		// find out the Area of Triangle, Rectangle and Circle
		//using Switch Case
		
		System.out.println("1.Triangle\n2.Rectangle\n3.Circle");
		System.out.print("enter your choice : ");
		int c = sc.nextInt();
		switch (c) {
		case 1:
			// Area of Triangle =1/2 b*h
			int b=10,h=20;
			int x = b*h;
			System.out.println(" Area of Triangle :" + (x/2));
			
			//System.out.println(" Area of Triangle");
			break;
		case 2:
			int l=15,w=12;
			int v = l*w;
			System.out.println(" Area of Rectangle :" + v);
			break;
		case 3:
			int r =5;
			int z = r*r;
			
			System.out.println(" Area of Circle :"+ (Math.PI*z));
			break;

}
}

}
