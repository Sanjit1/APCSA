public class SelfDivisor {
	// a)
	public static boolean isSelfDivisor(int number) {
		if (Integer.toString(number).indexOf("0")!=-1) { // If the string contains 0
			return false; // Return false and terminate the function
		}
		for (int i = 0; i < Integer.toString(number).length(); i++) { // Loop through all the digits
			if (number % Integer.parseInt(String.valueOf(Integer.toString(number).charAt(i))) != 0) { // If the modulus does not = 0 then it is not divisible 
				return false; // in which case return false and terminate the program
			}
		}
		return true; // If the program has made it this far that means that the number is a Self DIvisor thus return true
	}
	
	// b)
	public static int[] firstNumSelfDivisors(int start, int num) {
		int[] result = new int[num];
		int currentIndex = 0;
		int resultIndex = 0;
		while(resultIndex < num) {
			if (isSelfDivisor(start+currentIndex)) { 
				result[resultIndex] = start + currentIndex;
				resultIndex++;
			}
			currentIndex++;
		}
		return result;
	}
}