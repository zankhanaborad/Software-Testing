package Basic;

public class Practical4 {
	public static void main(String[] args) {
		
		int i,n,sum = 0,count=0;
		for(n=1;n<=100;n++) {
			for(i=2;i<=i/2;i++) {
				if(n%i==0) {
					count++;
					break;
				}
			}
			if(count ==0 && n!=1) 
			{
				sum = sum + n;
			}
		}
		System.out.println("/n the sum of 1 to 100 prime number :" +sum);
	}

}
