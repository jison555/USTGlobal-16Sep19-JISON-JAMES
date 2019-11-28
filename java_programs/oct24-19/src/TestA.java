
public class TestA {
	
	static int a;
	int b;
	
	static {
		a=10;
		System.out.println("static block 1");
		System.out.println("a value is "+a);
	}
	
	TestA() {
		System.out.println("Test() constructor");
	}
	
	public static void main(String[] args) {
		TestA t=new TestA();
		TestA t1=new TestA();
		System.out.println("a value is " +a);
	}
	
	static {
		a=20;
		System.out.println("static block 2");
	}
	
	static {
		a=40;
		System.out.println("static block 3 ");
		System.out.println("a value is "+a);
	}

}
