package multithreading;

class Student implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Student");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
class Employee implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Employee");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class ThreadUsingRunnable {

	public static void main(String[] args) throws InterruptedException {
		Student s1=new Student();
		Employee emp=new Employee();
		
		Thread t1=new Thread(s1);
		t1.setPriority(1);
		t1.start();
		
//		t1.join();
		
		Thread t2=new Thread(emp);
		t2.setPriority(10);
		t2.start();
//		t2.join();
//		System.out.println(t2.isAlive());
		
		
	}

}
