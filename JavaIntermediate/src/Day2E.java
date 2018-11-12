import java.util.*;

public class Day2E {

	public static void main(String[] args) {
		String[] stuff = {"crybaby","noob","roses","red","tomato"};
		LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
		
		thelist.add("HelloPumpkin");
		thelist.addFirst("Topper");
		
		stuff = thelist.toArray(new String[thelist.size()]);
		
		
		for(String x: stuff)
			System.out.printf("%s ", x);
		
	}

}
