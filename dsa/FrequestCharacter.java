package dsa;

import java.util.HashMap;

public class FrequestCharacter {

	public static void main(String[] args) {
		 String S = "John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker";
	       String C = "Example";
	       System.out.println(solution(S, C));
	}
//	private static String solution(String S) {
//        int[] occurrences = new int[26];
//        for (char ch : S.toCharArray()) {
//            occurrences[ch - 'a']++;
//        }
//
//        char best_char = 'a';
//        int  best_res  = occurrences[0];
//
//        for (int i = 1; i < 26; i++) {
//            if (occurrences[i] >best_res) {
//                best_char = (char)('a' + i);
//                best_res  = occurrences[i];
//            }
//        }
//
//        return Character.toString(best_char);
//    }
	 public static String solution(String S, String C) {
	       String[] names = S.split("; ");
	       HashMap<String, Integer> emailCounts = new HashMap<>();
	       StringBuilder result = new StringBuilder();
	       String company = C.toLowerCase();
	       for (String name : names) {
	           String[] parts = name.split(" ");
	           String firstName = parts[0].toLowerCase();
	           String lastName = parts[parts.length - 1].toLowerCase().replaceAll("-", "");
	           if (lastName.length() > 8) {
	               lastName = lastName.substring(0, 8);
	           }
	           String email = firstName + "." + lastName + "@" + company + ".com";
	           int count = emailCounts.getOrDefault(email, 0);
	           emailCounts.put(email, count + 1);
	           if (count > 0) {
	               email = firstName + "." + lastName + (count + 1) + "@" + company + ".com";
	           }
	           
	           result.append(name).append(" <").append(email).append(">; ");
	           
	       }
	       if(result.length()>0) {
        	   result.setLength(result.length()-2);
           }
	       return result.toString().trim();
	   }

}
