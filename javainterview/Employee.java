package javainterview;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Employee {
		
		private final int id;
		private final String name;
		
		private final Map<String,String> address = new HashMap<>();
		
		public Employee(int id, String name) {
			this.id=id;
			this.name=name;
			address.put("c", "C");
			address.put("p", "P");
		}
		
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public Map<String,String> getAddress(){
			return Collections.unmodifiableMap(address);
//			return address;
		}
		
	public static void main(String[] args) {
		Employee object=new Employee(1,"abc");
//		object.getAddress();
		System.out.println(object.getAddress());
		object.getAddress().put("a", "A");
		System.out.println(object.getAddress());
		
	}

}
