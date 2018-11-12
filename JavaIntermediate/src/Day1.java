
public class Day1 {

	public static void main(String[] args) {
		String[] words = {"curry","cap","creative","idiot","hurry","cream"};
		
		for(String w : words) {
			if(w.startsWith("cre"))
				System.out.println(w + " Starts with cre");
		}
		
		
		for(String x : words) {
			if(x.endsWith("rry"))
				System.out.println(x + " Ends  with rry");
		}


}
}