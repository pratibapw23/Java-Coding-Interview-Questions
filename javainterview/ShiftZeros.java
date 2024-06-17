package javainterview;

import java.util.Arrays;

public class ShiftZeros {

	public static void main(String[] args) {
		int nums[]= {1, 0, -2, 0, 3, 0, 4, 5};
		int arr[]=shiftZeros(nums);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] shiftZeros(int[] nums) {
		int arr[]=new int[nums.length];
		int n=nums.length;
		int pos=0;
		for(int i=0;i<n;i++) {
			if(nums[i]==0) {
				arr[pos++]=0; //0 0 0 //1//2//3
			}
		}
		//arr[0 0]
		
		//
//		System.out.println(Arrays.toString(arr));
		for(int i=0;i<n;i++) {
			if(nums[i]!=0) {
				arr[pos++]=nums[i]; //0 0 0 1 -2 
			}
		}
		System.out.println(Arrays.toString(arr));
		return null;
	}

}
