package advioserAvg;

public class advisorAvg {


/*
 * Write a program to display the advisered average for the list of 
 * numbers my omitting the three largest number in the series.
 * E.g:3,6,12,55,289,600,534,900,172.  
 * avg = (3+6+12+55+289+172)/6 and eliminating 534,900,600
 */
//public class advisorAvg {
	public static void main(String args[]) {
		int[] arr1 = {3,6,12,55,289,600,534,900,172};
		int[] arr = {3,6,9,12};
		System.out.println(advioserdAvg(arr));
		
	}
	
	public static double advioserdAvg(int[] arr) {
		if (arr.length <= 3) {
			return 0;
		}
		// max1<max2<max3
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		//eg: 5 2 3 4 
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] > max1 ) {
				max1 = arr[i];
			} 
			if (max1 > max2) {
//				int temp = max1; 
//				max1 = max2;
//				max2 = temp;
				swith(max1, max2);
			}
			if (max2 > max3) {
//				int temp = max3; 
//				max3 = max2;
//				max2 = temp;

				swith(max2, max3);
			}
			
		}
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(max3);

		return 1.0 * (sum - max1 - max2- max3)/(arr.length - 3);
	}
	public static void swith(int a, int b) {
		int temp = a; 
		a = b;
		b = temp;
	} 
	
}
