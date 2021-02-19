package recursion_1;

public class R1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum is " + xMethod(5));
		System.out.println("Sum is " + xMethodIte(5));
	}

	
	public static int xMethod(int n) {
	   	 if (n == 1)
	   		 return 1;
	   	 else
	   		 return n + xMethod(n - 1);
	}
	
	public static int xMethodIte(int n) {
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			sum += i;
		}
		return sum;
	}
}
