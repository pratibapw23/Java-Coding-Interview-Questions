package javainterview;

interface myinterface{
	int a=10;
//	void add();

	default void add() {
		System.out.println("Interface method");
	}
}
class A{
//	int a=10;
	public A() {
		System.out.println("A constructor");
	}
	public void add() {
		System.out.println("Add A");
	}
	public static void sub() {
		
		System.out.println("Static A sub");
	}
	static {
		System.out.println("A's static block");
	}
	{
		System.out.println("A's instance block");
	}
}
class B extends A{
	public B() {
		super();
		System.out.println("B constructor");
	}
	@Override
	public void add() {
		System.out.println("Add B");
	}
	static {
		System.out.println("B's static block");
	}
	public static void sub() {
		System.out.println("B's static method");
	}
	{
		System.out.println("B's instance block");
	}
}
class C extends B implements myinterface{
	public C(){
//		super();
		System.out.println("C's constructore");
	}
	int a=90;
	@Override
	public void add() {
		System.out.println("Add C");
	}
}


public class mainclass{
	public static void main(String args[]) {
		myinterface obj=new C();
		obj.add();
		System.out.println(obj.a);
		System.out.println(myinterface.a);
		
	}
}
