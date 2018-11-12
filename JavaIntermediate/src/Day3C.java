import java.util.*;
public class Day3C {

	public static void main(String[] args) {
		
		Integer[] iray = {2,3,5,8,7};
		Character[] cray = {'s','d','f','g','h'};
		
		printMe(iray);
		printMe(cray);
		
	}
	public static void printMe(Integer[] i) {
		for(Integer x:i)
			System.out.printf("%s ", x);
		System.out.println();
	}
	public static void printMe(Character[] i) {
		for(Character x:i)
			System.out.printf("%s ", x);
		System.out.println();
	}

}
