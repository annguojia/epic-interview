package SMS;

public class SMS{
	private static String[] map = {"0","1", "ABC2", "DEF3", "GHI4", "JKL5", "OPQ6", "RST7", "UVW8", "XYZ9", ""};
	public static void main(String args[]) {
		SMS("22#222*3");
	}
	public static void SMS(String digits) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < digits.length(); i++) {
			if (digits.charAt(i) == '#') {
				continue;
			}
			if (digits.charAt(i) == '*') {
				sb.append(" ");
			} else {
				String cur = map[digits.charAt(i) - '0'];
				int count = 0;
				while(i + 1 < digits.length() && digits.charAt(i) == digits.charAt(i + 1)) {
					i++;
					count++;
				}
				sb.append(cur.charAt(count % cur.length()));
			}
		}
		System.out.println(sb);
	}
}