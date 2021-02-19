package recursion_2;

public class R2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isOdd(25));
		System.out.println(isEven(30));
	}
	
    public static boolean isOdd(int x) {
		if(x==1) {
			return true;
		} else if(x==0) {
			return false;
		} else {
		return	isOdd(x-2);
		}
		
	}
	
	public static boolean isEven(int x) {
		
		if(x==1) {
			return false;
		}
		if(x==0) {
			return true;
		} else {
		return isEven(x-2);
		}
	}
}
