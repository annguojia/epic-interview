package mergeAddiitive;

public class mergeAdditive {
	public static void main(String args[]) {
		String res = "12220001";
		String tt = "";
		int i = 0;
		while( i < res.length()) {
//			int count = 1; 
			char cur = res.charAt(i);
			int j = i + 1;
			while (j < res.length() && res.charAt(j) == res.charAt(i)){
				j++;
//				count++;
			}
			i = j;
//			tt = tt + String.valueOf(count) + String.valueOf(cur);
			tt = tt + String.valueOf(cur);
		}
		System.out.println(tt);
	}
	 
}
