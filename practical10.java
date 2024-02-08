package Basic;


import java.util.Scanner;

public class practical10 {
	public static void main(String[] args) {
		
	

	try {
			Scanner sc = new Scanner(System.in);
			System.out.print("enter x = ");
			int x = sc.nextInt();
			System.out.print("enter y = ");
			int y = sc.nextInt();
			int z = x / y;
			System.out.println(z);
		} catch (ArithmeticException e) {
			System.out.println("cannot subscription  by big value");
	}
}
}


