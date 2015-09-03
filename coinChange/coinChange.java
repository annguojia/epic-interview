package coinChange;

/*
 * Something cost $10.25 and the customer pays with a $20 bill, the 
 * program will print out the most efficient "change-breakdown" which 
 * is 1 five, 4 ones, and 3quarters. Find the minimum number of coins 
 * required to make change for a given sum (given unlimited number of N 
 * different denominations coin)
 */
public class coinChange {
	public static void main(String args[]){
		double give = 20; 
		double cost = 10.25;
		coinChange(give - cost);
	}
	public static void coinChange(double change) {
		// int[] numOfSet = new int[set.length];
		if (change < 0) {
			System.out.println("Money not enough");
		}
		if (change == 0) {
			System.out.println("Same amount, no need for change");
		}
		double[] set = {5, 1, 0.25, 0.1};
		int[] numOfSet = new int[set.length];
		for (int i = 0; i < set.length; i++) {
			numOfSet[i] = (int)( change / set[i]);
			change = change - numOfSet[i] * set[i]; 
			if (change == 0) {
				break;
			}
		}
		for (int i = 0; i < numOfSet.length; i++){
			System.out.println(set[i] +"*"+numOfSet[i]);
		}
	} 
}
