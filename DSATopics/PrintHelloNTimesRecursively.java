package DSATopics;

public class PrintHelloNTimesRecursively {

	public static void main(String[] args) {
		print(0,5);
	}

	private static void print(int i, int j) {
		if(i==j)
			return;
		System.out.println("hello");
		print(i+=1,j);
	}

}
