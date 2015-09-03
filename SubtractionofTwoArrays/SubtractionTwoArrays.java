package SubtractionofTwoArrays;

public class SubtractionTwoArrays {
	public static void main(String args[]) {
		int[] A = {3,2,3,4,5};
		int[] B = {4,5,6,3};
		for (int i = 0; i < subtractionTwoArrays(A, B).length; i++) {
			System.out.println(subtractionTwoArrays(A, B)[i]);
		}
	}
	public static int[] subtractionTwoArrays(int[] A, int[] B) {
		if (A.length < B.length) {
			return null;
		}
		int[] res = new int[A.length];
		int carry = 0; 
		int diff = A.length - B.length;
		for (int i = B.length - 1; i >= 0; i-- ) {
			if (A[i+diff] - B[i ] - carry < 0) {
				res[i+diff] = 10 + A[i+diff] - B[i] - carry;
				carry = 1;
			} else {
				res[i+diff] = A[i+diff] - B[i] - carry;
				carry = 0;
			}
		}
		for (int j = A.length - B.length - 1; j >= 0; j--) {
			res[j] = A[j] - carry;
			if (A[j] < 0) {
				res[j] = A[j] + 10; 
				carry = 1;
			} else {
				carry = 0;
			}
		}
		return res;
		
	}
}
