package twoPrimes;
/**
 * Goldbach's conjecture : Every even integer greater than 2 
 * can be expressed as the sum of two primes. Write a function
 * which takes a number as input, verify if is an even number 
 * greater than 2 and also print at least one pair of prime numbers.
 */
public class twoPrimes {
	public static void main(String args[]) {
		twoPrimes(100);
//		twoPrimes(10);
	}
	public static void twoPrimes(int num) {
		if (num % 2 != 0) {
			System.out.println("This number is not an EVEN Number!");
		} else {
			for (int i = 2; i <= num/2; i++) {
				if (isPrime(i) && isPrime(num - i)) {
					System.out.println(i + " + " + (num - i));
				}
			}
		}
		
	}
	public static boolean isPrime(int num) {
		if (num == 2) {
			return true;
		}
		for (int i = 3; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
		
	}

}
