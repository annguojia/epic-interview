package MaximumSubarray;

public class MaxiSubarray {
/**
 * Find the largest sum contiguous sub array.   
 * The length of the returned sub array must be at least of length 2
 */
	public static void main(String args[]) {
		int[] nums = {-1, 0, 6, 5, -3, 8};
		for (int i = 0; i < maxSubarray(nums).length; i++) {
			System.out.println(maxSubarray(nums)[i]);
		}
		
	}
	public static int[] maxSubarray(int[] nums) {
		int[] dp = new int[nums.length + 1];
		dp[0] = 0; 
		int min = nums[0];
		int sum = nums[0]; 
		dp[1] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			sum = sum + nums[i];
			dp[i + 1] = Math.max(dp[i], sum - min);
			min = Math.min(min, nums[i]);
		}
		return dp;
	}
}
