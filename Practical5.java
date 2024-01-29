package Basic;
// calculate the average value of array elements. 


public class Practical5 {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		
		for(int index=0;index<=a.length;index++) {
			//System.out.println("i :" +a[index]);
		}
		int sum=0;
			for(int index1=0;index1<a.length;index1++)
			{
				sum = sum+a[index1];
		
			}
			System.out.println("Calculate the sum of array ="+sum);
			
	//calculate the average value of array elements. 
			System.out.println();
			for(int index1=0;index1<a.length;index1++)
			{
				sum = sum+a[index1];
		
			}
			  double avg = sum / a.length;
			  System.out.println("Average value of array :"+avg);
	}
	
	
	


}
