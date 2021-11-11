import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
/*
 * This class demonstrate how to generate array of random numbers with a given length 
 */
public class randomArray {
	
	public static Random random = new Random();
	
	
	// This method takes int parameter to set the length of an array and returns ArrayList
	public static String randomNumbersArray(int arrayLength) {

		int[] randomNumbers = new int[arrayLength];
		
		// Generate random numbers between 1 and 100
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = random.nextInt(100);
		}
		return (Arrays.toString(randomNumbers));

	}

	// This method takes int parameter to set the length of an array and returns Array
	public static ArrayList<Integer> randomNumbersArrayList(int arrayLength) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		// Generate random numbers between 1 and 100
		for (int i = 0; i < arrayLength; i++) {
			arrayList.add(random.nextInt(100));
		}
		return arrayList;

	}
	// main method 
	public static void main(String[] args) {
		// Both randomNumbersArray and randomNumbersArrayList serve the same purpose 
		System.out.println(randomNumbersArray(5)); //set the array length to 5
		System.out.println(randomNumbersArrayList(5)); //set the array length to 5

	}

}