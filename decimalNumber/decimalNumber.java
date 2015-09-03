package decimalNumber;


/*
 * Let the user enter a decimal number. The range allowed is 0.0001 to 0.9999.
 * Only four decimal places are allowed. The output should be an irreducible 
 * fraction. E.g.: If the user enters 0.35,the irreducible fraction will be 7/20.
 */
public class decimalNumber{
	public static void main(String args[]) {
		fraction(1.0125);
//		System.out.println();
	}
	public static void fraction(double deci) {
		int part1 = 0; 
		if (deci > 1) {
			part1 = (int)deci;
			deci = deci - (int)deci;
		} 
		int dem = (int) (deci * 10000 + part1 * 10000);
		int num = 10000; 
		int gcd = gcd(num, dem);
		System.out.println(dem / gcd + "/" + num / gcd);
	}
	public static int gcd(int a , int b) {
		if(a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (a % b == 0) {
			return b;
		} else {
			return gcd(b, a % b);
		}
	}
}