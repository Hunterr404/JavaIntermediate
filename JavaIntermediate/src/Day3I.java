import java.util.*;
public class Day3I implements Runnable{
	String name;
	int time;
	Random r = new Random();
	
	public Day3I(String x) {
		name = x;
		time = r.nextInt(999);
	}
	public void run() {
		try {
			System.out.printf("%s is sleeping for %d\n", name,time);
			Thread.sleep(time);
		}catch(Exception e) {}
	}

}
