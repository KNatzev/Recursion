package recursion_1;

public class R1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PowOf2(5));
		System.out.println(PowOf2Ite(5));
	}
	
	public static int PowOf2(int n) {
		if(n==1) {
			return 2;
		} else {
			return 2*PowOf2(n-1);
		}
	}
	
	public static int PowOf2Ite(int n) {
		int Po2 = 1;
		for(int i =0; i<n ; i++) {
			Po2*=2;
		} return Po2;
	}
}
