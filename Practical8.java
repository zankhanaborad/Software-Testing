package Basic;


abstract class Teacher{
	
	abstract public void call();
	abstract public void function();
	 public static  void call1() {
		 
		System.out.println("call the call1 function");
	}
	
}
 class child1 extends Teacher{
	 public void call() {
		 System.out.println("call the child1 ");
		 
	 }
	 public void function() {
		 System.out.println("hello 1");
		 
	 }
	
}

 class child2 extends Teacher{
	 public void call() {
		 System.out.println("call the child2 ");
		 
	 }
	 public void function() {
		 System.out.println("hello 2");
		 
	 }
	
}
 class child3 extends Teacher{
	 public void call() {
		 System.out.println("call the child 3 ");
		 
	 }
	 public void function() {
		 System.out.println("hello 3");
		 
	 }
	
}
public class Practical8 {
	public static void main(String[] args) {
		Teacher m = new Teacher();
		m.call();
		m.function();
		
		child1 c1 = new child1();
		c1.call();
		c1.function();
		
		child2 c2 = new child2();
		c2.call();
		c2.function();
		
		child3 c3 = new child3();
		c3.call();
		c3.function();
		
		Teacher.call1();
		child1.call1();
		child2.call1();
		child3.call1();
		
			
			
	}

}
