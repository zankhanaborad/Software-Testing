package Basic;

import java.util.Scanner;

class A{
	public void call() {
		System.out.println("call function in A class");
	}
	public void fun() {
		System.out.println("fun function");
	}
}
class B{
public class Userinput {
public static void main(String[] args) {
	int a,b;
	A obj = new A();
	obj.call();
	obj.fun();
	System.out.println("enter value of a = ");
	Scanner sc = new Scanner(System.in);
	a  = sc.nextInt();
	System.out.println("enter value of b = ");
	b = sc.nextInt();
	System.out.println(a+b);
	double d;
	System.out.println("enter value of d = ");
	d = sc.nextDouble();
	System.out.println(d);
	


	
}
}
}
