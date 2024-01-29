 package Basic;

public class Practical3 {
	public static void main(String[] args) {
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=5;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print("*");
			}
			System.out.println();
			
	}
		System.out.println();
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print(a);
			}
			System.out.println();
		}
		System.out.println();
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		System.out.println();
		for(int a=1;a<=5;a++) {
			for(int b=5;b>=a;b--) {
				System.out.print("*");
				
			}
			System.out.println();
			for(int a1=1;a1<=5;a1++) {
				for(int b=5;b>=a1;b--) {
					System.out.print(a1);
				}
				System.out.println();
			
			}
			System.out.println();
			for(int a1=1;a1<=5;a1++) {
				for(int b=5;b>=a1;b--) {
					System.out.print(b);
				}
				System.out.println();
			}
			System.out.println();
			for(int a1=1;a1<=5;a1++) {
				for(int b=5;b>=a1;b--) {
					System.out.println();
			}
				System.out.println();
				
				 for (int i = 1; i <= 6; i++) {
					 for (int j = 1; j <= i; j++) {
			           if ((i + j) % 2 == 0) {
			        	   System.out.print(1);
			                }
			      else {
			                  System.out.print(0);
	                   }
			           System.out.println();
			          int n=6;
			        
			           for (i = 1; i <= n; i++) {
			                for (j = 1; j <= n - i; j++) {
			                   System.out.print(" ");
			               }
			                for (j = 1; j <= i; j++) {
				                   System.out.print(i + " ");  
			                }
				               // print new line for each row
				               System.out.println();   
			              
			           }
			       }
			    
			       
			        
			       }
			            }
			 
				 }
			
			}
}