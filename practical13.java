package Basic;

public class practical13 {

	public static void main(String[] args) {
		

	    int num = 51, i = 8;
	    boolean flag = false;
	    while (i <= num / 2) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }

	      ++i;
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	}
}
