public class Day3D {

	public static void main(String[] args) {
		
		Integer[] iray = {2,3,5,8,7};
		Character[] cray = {'s','d','f','g','h'};
		
		printMe(iray);
		printMe(cray);
		
	}
	public static <T> void printMe(T[] i) {
		for(T d :i)
			System.out.printf("%s ", d);
		System.out.println();
	}
	

}
