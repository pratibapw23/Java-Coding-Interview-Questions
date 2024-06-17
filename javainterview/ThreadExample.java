package javainterview;

import java.util.HashMap;
import java.util.Map;

class producer extends Thread{
	public Map<Character, Integer> map=new HashMap<>();
	
	public void run() {
		map.put('a', 1);
	}
	
}
class consumer extends Thread{
	
	public void run() {
		producer obj=new producer();
		System.out.println(obj.map);
	}
}
public class ThreadExample{
	
//	public void run() {
//		System.out.println("welcome");
//	}

	public static void main(String[] args) {
//		ThreadExample obj=new ThreadExample();
//		obj.start();
		producer p1=new producer();
		consumer c1=new consumer();
		
		p1.start();
		c1.start();
	}
	

}
