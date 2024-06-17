package javainterview;

public class CopyCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		int k=2;
		String res=copyCopy(str,k);
		System.out.println(res);
	}

	private static String copyCopy(String str, int k) {
		
		
		StringBuilder s0=new StringBuilder(str);
		StringBuilder s1=new StringBuilder();
		for(int i=1;i<=k;i++) {
			if(i%2==1) {
				s1.append(new StringBuilder(str).reverse());
			}
			else {
				s1.append(str);
			}
		}
		return s0.append(s1).toString();
	}

}
