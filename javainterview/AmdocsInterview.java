package javainterview;

//count occurrences of str in text

public class AmdocsInterview {

	public static void main(String[] args) {
		String text="AABBAAABSBDHAAABSHSG";
		String str="BB";
		int count=countOccurrences(text,str);
		System.out.println(count);
	}

	private static int countOccurrences(String text, String str) {
		int i=0,j=1;
		
		int count=0;
		while(i<j && j<text.length()) {
			StringBuffer s=new StringBuffer();
			s.append(text.charAt(i));
			s.append(text.charAt(j));
			if(s.toString().equals(str)) {
				count++;
			}
			i+=2;
			j+=2;
		}
		return count;
	}

}
