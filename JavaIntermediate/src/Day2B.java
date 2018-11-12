
public class Day2B {

	public static void main(String[] args) {
		System.out.println(facto(6));

	}
	
	public static long facto(long n) {
		if(n <=1)
			return 1;
		else
			return n*facto(n-1);
	}

}
