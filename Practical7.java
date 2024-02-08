package Basic;

class parent {
	public void call(int a) {
		System.out.println("call the first function");
	}

	public void call(int a, int b) {
		System.out.println("call the second function");
	}

}

class child extends parent {
	public void call(int a) {
		super.call(11);
		System.out.println("call in the child class");
	}
}

public class Practical7 {
	public static void main(String[] args) {
		parent p = new parent();
		p.call(11);
		child c = new child();
		c.call(11);
	}
}
