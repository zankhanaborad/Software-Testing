package Basic;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int A = 10;
		System.out.println("i =" +A);
		
		int i[] = {1,2,3,4,5,6};
		System.out.println(i[1]);
		
		for(int index=0;index<=i.length;index++){
		System.out.println("i = "+i[index]);
		}
		int sum = 0;
		for(int index=0;index<i.length;index++)
		{
			sum = sum+i[index];
		//	System.out.println("sum" +sum);
		}System.out.println("sum ="+sum);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array :");
	int size = sc.nextInt();
	int arr[] = new int [size];
	for(int index=0;index<arr.length;index++) {
		
		System.out.println("Emter element of arr["+index+"]:");
		arr[index] = sc.nextInt();
		
	}
	System.out.println("Enter number to search array:");
	int num = sc.nextInt();
	int counter = 0;
	for(int index=0;index<arr.length;index++) {
		if(num == arr[index]) {
			counter++;
		}
	}
	if(counter>0) {
		System.out.println("yes"+num+" is exist "+counter+" times");
	}
	else {
		System.out.println("no");
	}
	}
	

}
