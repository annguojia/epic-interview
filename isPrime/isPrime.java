package isPrime;

import java.util.ArrayList;

public class isPrime {
	public static void main(String args[]) {
//		ArrayList<Integer> result = prime(100);
//		for (int i = 0; i < result.size(); i++) {
//			System.out.println(result.get(i));
//		}
		prime(100);
	}
	public static void prime(int range) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(2);
		for(int i=3;i<=Math.sqrt(range);i++){
			int len = res.size();
			for(int k=0;k<len;k++){
				if(i%res.get(k)==0){
					break;
				}else{
					if(!res.contains(i)){
						res.add(i);
						}
				}
			}
		}
		System.out.println(res);
//		ArrayList<Integer> res = new ArrayList<Integer>();
//		if (range < 2) {
//			return res;
//		}
//		if (range == 2) {
//			res.add(2);
//			return res;
//		}
//		int i = 3;  
//		res.add(2);
//		
//		while (i <= range) {
//			boolean flag = true;
//			for (int j = 2; j < i; j++) {
//				if (i % j== 0) {
//					flag = false;
//					break;
//				} 
//			}
//			if (flag == true) {
//				res.add(i);
//			}
//			i++;
//		}
//		return res;
	}
}