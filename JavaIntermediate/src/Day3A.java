import java.util.*;
public class Day3A {

	public  static void main(String[] args) {
		
		PriorityQueue<String> q = new PriorityQueue<String>();
		
		q.offer("First");
		q.offer("Second");
		q.offer("Third");
		
		System.out.printf("%s ", q);
		System.out.println();
		
		System.out.printf("%s ", q.peek());
		System.out.println();
		
		q.poll();
		System.out.printf("%s ", q);

	}

}
