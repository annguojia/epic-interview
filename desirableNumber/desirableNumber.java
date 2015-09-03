package desirableNumber;

import java.util.ArrayList;

public class desirableNumber {
	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> res = desirableNumber(6);
		for (int i = 0; i< res.size(); i++) {
			System.out.println(res.get(i));
		}
	}
	public static ArrayList<ArrayList<Integer>> desirableNumber(int n) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> path = new ArrayList<Integer>();
		helper(res, path, n, 0);
		return res;
	}
	public static void helper(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> path, int n , int pos) {
		if (n == 0) {
			res.add(new ArrayList<Integer>(path));
			return;
		}
		for (int i = pos; i <= 9; i++) {
			path.add(i);
			helper(res, path, n - 1, i + 1);
			path.remove(path.size() - 1);
		}
	}
}
