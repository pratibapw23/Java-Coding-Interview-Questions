package javainterview;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstDuplicateChar {

	public static void main(String[] args) {
		String str="Today is Thursday";
		char ch=getFirstDuplicate(str);
		System.out.println(ch);
	}

	private static char getFirstDuplicate(String str) {
		Map<Character, Integer> map=new LinkedHashMap<>();
		for(char ch:str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) return entry.getKey();
		}
		return 0;
	}

}
