package multithreading;

class PrintHi extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hi");
			try{Thread.sleep(1000);}catch(Exception e) {};
		}
			
	}
}
class PrintHello extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hello");
			try{Thread.sleep(1000);}catch(Exception e) {};
		}
	}
}
public class MyThread {

	public static void main(String[] args) {
		PrintHi hi=new PrintHi();
		PrintHello hello=new PrintHello();
		
		hi.start();
		hello.start();
	}

}
