package week04;

public class Week04Project {

	public static void main(String[] args) {  

		// initialize array called ages and populate it with given integers.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// subtract first age from last age and print to console. ages[0] returns first element in the array.
		// ages.length will be the number of elements in the array (8). Arrays are indexed starting at 0.
		// ages.length-1 will give the last item in the array, in this case at index 7.
		
		System.out.println(ages[ages.length-1] - ages[0]);
		
		
		// array called ages2 with length of 9 instantiated
		int[] ages2 = new int[9];
		
		
		// filling ages2[] with the items from ages[] in reverse for fun, and adding a new int at the end
		
		for (int i = 0; i < ages.length; i++) {
			
			ages2[i] = ages[(ages.length - 1 - i)];
			
		}
		
		ages2[8] = 111;
		
		// Subtracting first element in ages2 array from last element in ages2 array programmatically.
		System.out.println(ages2[ages2.length-1] - ages2[0]);
		
		
		// I will demonstrate using the index values for arrays is dynamic by printing ages.length and ages2.length
		// to the console to show they are different. Further, I will print ages[3] and ages2[3] to show that the results
		// are different despite being the same index.
		System.out.println(ages.length + ", " + ages2.length);
		System.out.println(ages[3] + ", " + ages2[3]);
		

		// I will create a loop that adds all the values of ages2 and saves it in an int,
		// then divide that in by ages2.length. This will give the average. I will make the result a double in case of decimals.
		
		int sum = 0;
		
		for (int x : ages2) {
			
			sum += x;
			
		}
		
		double averageAge = sum / ages2.length;
		System.out.println("Agerage age: " + averageAge);

		// Instantiating an array of Strings called names that contains the given values
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		

		// Using a loop to iterate through names and calculate the average number of letters. This is done by
		// getting the current name's length, then adding it to an int sum. The sum is divided by the number
		// of names in the array.
		
		int sumNames = 0;
		
		for (String y : names) {
			
			sumNames += y.length();
			
		}
		
		double averageNames = sumNames / names.length;
		
		
		// iterating through the array and adding each item + a space onto a String called allNames 
		
		String allNames = "";
		for (String y : names) {
			
			allNames += y + " ";
			
		}
		
		
//		3. How do you access the last element of any array?

		// You access the last element of any array by using arrayName[arrayName.length-1]. This references the length of
		// the array starting with 1. You subtract 1 from this number because arrays are 0 indexed.
		
		
//		4. How do you access the first element of any array?

		// You access the first element in an array using arrayName[0]. Arrays are 0 indexed so 0 will always give the first item.
		
		
		// Instantiating a new array and calling it nameLengths. I calculate how long the array should be by making
		// it the same length as the names array so it will have the same number of entries.
		// Next I iterate through the array using index i, setting each item in nameLengths to the corresponding names.length.

		int[] nameLengths = new int[names.length];
		
		for (int i = 0; i < nameLengths.length; i++) {
			
			nameLengths[i] = names[i].length();
			
		}
		
		
		// This loop iterates over nameLengths array and calculates the sum of each array item by adding each array item
		// to a new int called nameLengthsSum. This is printed to the console.
		
		int nameLengthsSum = 0;
		
		for (int z : nameLengths) {
			
			nameLengthsSum += z;
			
		}
		
		System.out.println("Name lengths sum: " + nameLengthsSum);

	}
	
	
	// This method takes a String word and an int n. Inside the method, a new String called result is instantiated.
	// A for loop runs n times and adds word to the result each time. Method returns result.
	
	public static String wordByNumber (String word, int n) {
		
		String result = "";
		
		for (int i = 0; i < n; i ++) {
			
			result += word;
			
		}
		
		return result;
	}
	
	
	// This method takes firstName and lastName. It returns a simple concatenation of the two with a space in between.
	
	public static String makeFullName (String firstName, String lastName) {
		
		return firstName + " " + lastName;
		
	}
	
	
	// This array takes in an array of ints. It sets a boolean result to false. The int sum is instantiated.
	// A loop iterates through each item in the array and adds the values to sum. Outside the loop, an if statement
	// checks if sum is > 100. If so, result is set to true. If not, result stays false. The method returns result.

	public static boolean arraySumHundredPlus (int[] arr) {
		
		boolean result = false;
		int sum = 0;
		for (int x : arr) {
			
			sum += x;
			
		}
		
		if (sum > 100) {
			
			result = true;
		}
		
		return result;
		
	}
	
	
	// This method takes an array of doubles. It instantiates double result and double sum, setting both to 0.
	// A loop iterates through each item in the array, adding it to the sum. Outside the loop, result is set to
	// sum / array length, which makes the average. Result is returned.
	
	public static double averageArr (double[] doubleArr) {
		
		double result = 0;
		double sum = 0;
		
		for (double x : doubleArr) {
			
			sum += x;
			
		}
		
		result = sum / doubleArr.length;
		
		return result;
	}
	
	
	// This method takes in two arrays of doubles. It's purpose is to check if the average of the elements in the first
	// array is greater than the average of the elements in the second array.
	// I instantiate a boolean result and set it to false.
	// An if statement compares if the average of array 1 is larger than array 2.
	// Since the method created just prior to this calculates a double array's average, I call that method inside this method
	// to make things cleaner and make life easier. This is what methods are for after all.
	// If average 1 is > average 2, result is set to true. Otherwise it will remain false.

	public static boolean greaterAverage (double[] dblArr1, double[] dblArr2) {
		
		boolean result = false;
		
			if (averageArr(dblArr1) > averageArr(dblArr2)) {
				
				result = true;
				
			}
		
		return result;
	}
	
		
	// This method returns a boolean. If it is hot outside and moneyInPocket is > 10.50, result is set to true.
	// An if statement checks if isHotOutside == true and if moneyInPocket is over 10.50. If both conditions are met,
	// result is set to true. Otherwise result remains false.

	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		
		boolean result = false;
		
		if (isHotOutside == true && moneyInPocket > 10.50) {
			result = true;
		}
		
		return result;
		
	}
	
	
	// This is a method to print the name from array names[] using the employee's ID number.
	// In this example, employee ID numbers start at 1000. So employee number 1008 has their name stored in the
	// 8th position of the array, or names[7].
	
	public static void printName (String[] names, int n) {
		
		int idNum = n - 1000;
		
		System.out.println("Employee #" + n + ": " + names[idNum]);
		
	}
	
	
		
}
