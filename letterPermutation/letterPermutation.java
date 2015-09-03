package letterPermutation;

import java.util.*;

public class letterPermutation{
	public static void main(String[] args){
		String s = "Oh my-god!";
		permutate(s);
	}

	public static void permutate(String input){
		char[] list = input.toCharArray();
		List<String> res = new ArrayList<String>();
		List<Character> candidates = new ArrayList<Character>();
		List<Integer> positions = new ArrayList<Integer>();
		for(int i=0;i<list.length;i++){
			if(Character.isLetter(list[i]) && Character.isLowerCase(list[i])){
				candidates.add(list[i]);
				positions.add(i);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<list.length;i++){
			sb.append(list[i]);
		}
		int pos = 0;
		permutation(res,candidates,positions,pos,sb);
		System.out.println(res);
		System.out.println(res.size());
	}

	public static void permutation(List<String> res, List<Character> candidates, List<Integer> positions, int pos, StringBuilder sb){
		if(pos == positions.size()){
			res.add(sb.toString());
			return;
		}
		for(int j=0;j<candidates.size();j++){
			sb.setCharAt(positions.get(pos),candidates.get(j));
			char c2 = candidates.remove(j);
			permutation(res,candidates,positions,pos+1,new StringBuilder(sb));// pass by reference, need to deep copy and pass the new object
			candidates.add(j,c2);
		}
	}
}