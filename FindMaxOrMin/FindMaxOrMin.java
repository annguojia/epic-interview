package FindMaxOrMin;

public class FindMaxOrMin {
	/*
	 * Take a series of integers as input till a zero is entered. 
	 * Among these given integers, find the maximum of the odd numbers and 
	 * the minimum of the even integers (not including zero) and print them.
	 */
/**
 * Take a series of integers as input till a zero is entered.   
 * Among these given integers, find the maximum of the odd numbers and the   
 * minimum of the even integers (not including zero) and print them
 */
	public static void main(String args[]) {
		int maxOdd = Integer.MIN_VALUE;
		int minEven = Integer.MAX_VALUE;
		String input = "1353255234329";
		for (int i = 0; i < input.length(); i++) {
			if (i % 2 == 1) {
				minEven = Math.min(minEven, input.charAt(i) - '0');
			} else {
				maxOdd = Math.max(maxOdd, input.charAt(i) - '0');
			}
		}
		System.out.println("minEven" + minEven);
		System.out.println("maxOdd" + maxOdd);
		
	}

}
