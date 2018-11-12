
public class Day3I1 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Day3I("one"));
		Thread t2 = new Thread(new Day3I("two"));
		Thread t3 = new Thread(new Day3I("three"));
		Thread t4 = new Thread(new Day3I("four"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

	}

}
