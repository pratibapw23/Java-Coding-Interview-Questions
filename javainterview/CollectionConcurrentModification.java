package javainterview;

import java.util.List;

public class CollectionConcurrentModification {

	public static void main(String[] args) {
		List<Integer> list=List.of(10,20,30,44,32,10,10,10);
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i)==10) {
//				list.remove(i);
//			}
//		}
//		list.remove(0);
		System.out.println(list);
		
//		Map<Integer,Integer> map=new HashMap<>();
//		map.put(1, 1);
//		map.put(2, 1);
//		map.put(3, 1);
//		map.put(4, 1);
//		map.put(5, 1);
//		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
//			if(entry.getValue()==1) {
//				map.put(entry.getKey(), 2);
//			}
//		}
//		System.out.println(map);
	}

}
