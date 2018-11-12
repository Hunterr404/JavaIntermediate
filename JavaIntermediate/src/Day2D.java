import java.util.*;
public class Day2D {

	public static void main(String[] args) {
		String[] things = {"cat","dog","rat","mat","bat"};
		List<String> list1 = new LinkedList<String>();
		for(String x : things)
			list1.add(x);
		
		
		String[] things2 = {"goat","dear","tiger","donkey"};
		List<String> list2 = new LinkedList<String>();
		for(String y:things2)
			list2.add(y);
		
		list1.addAll(list2);
		list2= null;
		
		printme(list1);
		removeStuff(list1,2,5);
		printme(list1);
		reverseMe(list1);
		
	}
	private static void printme(List<String> l) {
		for(String b:l)
			System.out.printf("%s ", b);
		System.out.println();
	}
	
		private static void removeStuff(List<String> l, int from, int to) {
			l.subList(from, to).clear();
		}
		private static void reverseMe(List<String> l) {
			ListIterator<String> merley = l.listIterator(l.size());
			while(merley.hasPrevious())
				System.out.printf("%s ", merley.previous());
		}

}
