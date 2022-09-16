package stringslicer;
import java.util.Random;
/*
 * This program prints random slices of a string.
 * It generates using the String substring function
 * as well as Random objects.
 * 
 */
public class App {
	public static void main(String[] args) {
		String phraseToSlice = "It is Friday finally, and we are happy.";
		Random rnd = new Random();
		int length = phraseToSlice.length();
		int startIndex = rnd.nextInt(length);
		int endIndex = startIndex + 1 + rnd.nextInt(length-startIndex);
		String sub = phraseToSlice.substring(startIndex,endIndex);
		System.out.printf("Between characters %d and %d, there is this: %s\n", 
				startIndex, endIndex, sub);
	}
}
