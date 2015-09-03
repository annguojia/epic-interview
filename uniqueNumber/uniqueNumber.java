package uniqueNumber;
/*
 * Write, efficient code for extracting unique elements from a sorted 
 * list of array. e.g. (1, 1, 3, 3, 3, 5, 5, 5, 9, 9, 9, 9)-> (1, 3, 5, 9).
 */
public class uniqueNumber {
	public static void main(String args[]) {
		int[] arr = {1, 1, 3, 3, 3, 5, 5, 5, 9, 9, 9, 9, 10};
		uniqueNumber(arr);
	}
	public static void uniqueNumber(int[] arr) {
		String res = "";
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				res += String.valueOf(arr[i] + ",");
			} 
		}
//		if (arr[arr.length - 1] != arr[arr.length - 2]) {
//			res += String.valueOf(arr[arr.length - 1]);
//		} else {
			res += String.valueOf(arr[arr.length - 1]);
//		}
		System.out.println(res);
	}

}
