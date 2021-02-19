package recursion_4;

import java.util.Random;

public class R4_4 {
	public static int[] nums = new int[50];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		for(int i = 0; i<50; i++) {
			nums[i]=rand.nextInt(10);
			System.out.println("Number "+(i+1)+": "+nums[i]);
		}
		System.out.println("Result is " + Average(10));
	}
	
	public static int Average(int n) {
		return Average(n, 0);
	}
	
	public static int Average(int n, int sum) {
		if(n==-1)
			return sum;
		else
			return Average(n-1, sum+nums[n]);
	}
}
