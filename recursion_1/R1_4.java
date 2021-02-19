package recursion_1;

public class R1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	System.out.println(PowOfX(4,3));
	   	System.out.println(PowOfXIte(4,3));
	}
	
	public static int PowOfX(int x , int n) {
		
		if(n==1) {
			return x;
		}
		else return x*PowOfX(x,n-1);
	}
	
	public static int PowOfXIte(int x, int n) {
		int sum = 1;
		for(int i =0; i<n ; i++) {
			sum*=x;
		} return sum;
	}

}