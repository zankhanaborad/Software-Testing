package Basic;

import java.util.Scanner;

class InsufficientException extends Exception{
	 int balance;
	 int wbalance;
	 public InsufficientException(String msg){
	 super(msg);
	 }
	 void withdraw(){
	 int balance=2000;
	 System.out.println("Current Balance: "+balance);
	 try{
	 System.out.print("Enter withdraw amount: "); 
	 Scanner in=new Scanner(System.in);
	 int wamount=in.nextInt();
	 if(wamount>balance){
	 throw new InsufficientException("Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.");
	 }
	 else
	 System.out.println("Transaction Successfully Completed");
	 int rembal=balance-wamount;
	 System.out.println("Withdrawal Amount :"+wamount);
	 System.out.println("After transaction current balance :"+rembal);
	 }
	 catch(InsufficientException e){
	 System.out.println("Caught:"+e.getMessage());
	 }
	 }
	}

public class practical26 {
	public static void main(String[] args) {
		
		 InsufficientException ie=new InsufficientException("Insufficient balance in account");
		 ie.withdraw();
		 }
		} 