package Basic;

public class Practical6 {
public static void main(String[] args) {
	char A[] = {'Z','A','N','K','H','A','N','A'};
	System.out.println(A);
	
	int a=10;
	int b=20;
	System.out.println(a+b);
	
	String name ="I am learning automation";
	System.out.println(name);
	
	String c="10";
	String d = "20";
	
	System.out.println(c+d);
	System.out.println(c.concat(d));
	
	//o Compare Two String.
	String s="python";
	String t = "python";
	
	System.out.println(s.compareTo(t));
	System.out.println(s.compareToIgnoreCase(t));
	System.out.println(s.concat(t));
	System.out.println(s.contains("th"));
	System.out.println(s.endsWith(t));
	System.out.println(name.contains("am"));
	System.out.println(s.equals(t));
	System.out.println(s.equalsIgnoreCase(t));
	System.out.println(name.length());
	System.out.println(s.toUpperCase());
	
	//concatenate a given string to the end of another string
	
	String a1 ="zankhana borad ";
	String b1 =" Ahmedabad";
	
System.out.print(a1);
System.out.print(b1);

String c1 = a1.concat(b1);
System.out.print("concatenate a given string :" +c1);
	

}
}
