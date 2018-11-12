import java.util.*;
public class Day2G {

	public static void main(String[] args) {
		Character[] ray= {'p','t','n'};
		List<Character> l = Arrays.asList(ray);
		System.out.println("List is :");
		output(l);
		
		Collections.reverse(l);
		System.out.println("After reverse :");
		output(l);
		
		
		Character[] newRay = new Character[3];
		List<Character> listCopy = Arrays.asList(newRay);
		
		Collections.copy(listCopy,l);
		System.out.println("Copy of list : ");
		output(listCopy);
		
		
		Collections.fill(l,'X');
		System.out.println("After filling the list  :" );
		output(l);
		
				
		
	}
	private static void output(List<Character> thelist) {
		for(Character thing: thelist)
			System.out.printf("%s ",thing);
		System.out.println();
	}
	

}
