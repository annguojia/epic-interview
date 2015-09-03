package additiveNumber;

public class additiveNumber{
	public static void main(String args[]) {
		if (isAdditiveNumber("11234")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}
	public static boolean isAdditiveNumber(String nums) {
		for (int i = 1; i < nums.length(); i++) {
			for (int j = i + 1; j < nums.length(); j++) {
				String num1 = nums.substring(0, i);
				String num2 = nums.substring(i, j);
				int part1 = Integer.parseInt(num1);
				int part2 = Integer.parseInt(num2);
				int sum = part1 + part2;
				String sumStr = String.valueOf(sum);
				String now = num1 + num2 + sumStr;
				int len = now.length();
				while(len < nums.length()) {
					part1 = part2;
					part2 = sum;
					sum = part1 + part2;
					now += String.valueOf(sum);
					len = now.length();
				}	
				if (now.equals(nums)) {
					return true;
				}				
			}
		}
		return false;
	}
}