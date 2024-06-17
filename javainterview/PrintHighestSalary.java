package javainterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintHighestSalary {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(50000);
		list.add(60000);
		list.add(70000);
		list.add(80000);
		list.add(90000);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list.get(0));
	}

}
