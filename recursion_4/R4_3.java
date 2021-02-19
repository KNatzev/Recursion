package recursion_4;

public class R4_3 {
	public static void main(String[] args) {
		System.out.println("Result is " + powRecursive(5, 3));
	}
	public static int powRecursive( int x, int n ) {
		return powRecursive(x, n, 1);
	}
    public static int powRecursive( int x, int n, int result ) {
      	 if (n == 0) {
      		 return result;
      	 }
      	 
      	 return powRecursive(x, n-1, result*x);
       }

}
