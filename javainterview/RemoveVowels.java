package javainterview;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String inputString=sc.nextLine();
		String str=removeVowels(inputString);
		System.out.println(str);
	}

	private static String removeVowels(String input) {
		
		List<Character> vowels = Arrays.asList('a','e','i','m','o','x','y');
		int count=0;
		StringBuilder str=new StringBuilder();
		for(char c:input.toCharArray()) {
			if(vowels.contains(c)) {
				count++;
				if(count<=1) {
					str.append(c);
				}
				
			}
			else {
				if(!(count>=2)) str.append(c);
				count=0;
			}
			
		}
		return str.toString();
		
	}

}
