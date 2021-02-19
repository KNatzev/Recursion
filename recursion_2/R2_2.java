package recursion_2;

public class R2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dec2Bin(4687));
	}
	
	public static String dec2Bin ( int value ) {
		if(value==0) {
			return "";
		} else {
			return dec2Bin(value/2) + value%2;
		}
	}
}
