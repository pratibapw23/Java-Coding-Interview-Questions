package javainterview;

import java.util.Arrays;

public class SecongHigestNum {

	public static void main(String[] args) {
		int num[]= {1};
		int number=getSecondHighestNumber(num);
		System.out.println(number);
	}

	private static int getSecondHighestNumber(int[] num) {
		//soring:
		int n=num.length;
//		for(int i=0;i<n-1;i++) {
//			int min=i;
//			for(int j=i+1;j<n;j++) {
//				if(num[j]<num[min]) {
//					min=j;
//				}
//			}
//			int t=num[min];
//			num[min]=num[i];
//			num[i]=t;
//		}
//		System.out.println(Arrays.toString(num));
//		
//		return num[n-2];
		if(n<2) {
		throw new IllegalArgumentException("Need At least 2 arguments");
		}
		int high=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
//		System.out.println(high);
		for(int i=0;i<n;i++) {
			if(num[i]>high) {
				second=high;
				high=num[i];
			}else if(num[i]>second && num[i]!=high) {
				second=num[i];
			}
		}
	
		if(second==Integer.MIN_VALUE) System.out.println("No second highest value");
//		System.out.println(second);
		
		return 0;
		
	}

}
