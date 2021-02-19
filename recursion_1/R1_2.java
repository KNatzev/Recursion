package recursion_1;

public class R1_2 {

	public static void main(String[] args) {
	   	 xMethod(1234567);
	   	 xMethodIte(1234567);
	}

	public static void xMethod(int n) {
	   	 if (n > 0) {
	   		 System.out.print(n % 10);
	   		 xMethod(n / 10);
	   	 }
	 }
	
	 public static void xMethodIte(int n) {
		 for(int i = n; i>0; i/=10) {
			 System.out.print(i % 10);
		 }
	 }
}
