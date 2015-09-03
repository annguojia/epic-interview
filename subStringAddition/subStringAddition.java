package subStringAddition;
import java.util.*;
/*
 * Write a program to add the substring. 
 * eg :say you have a list {1 7 6 3 5 8 9 }
 * and user is entering a sum 16. Output should display(2-4) that is {7 6 3} 
 * cause 7+6+3=16.
 */

public class subStringAddition{
	public static void main(String[] args){
		int[] list = {1, 7, 6, 3, 5, 8, 9};
		int target = 14;
		sub(list,target);
	}
	public static void sub(int[] list, int target) {
		int left = 0; 
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum += list[i];
			if (sum == target) {
				String temp = "";
				for(int k= left; k<i; k++){
					temp += list[k]+" ";
				}
				temp += list[i];
				System.out.println("("+ (left+ 1)+"-"+ (i+1) + ") that is {" + temp+"}" );
			} else {
				if (sum > target) {
					sum = sum - list[left];
					left++;
				}
				if(target == sum){
					String temp = "";
					for(int k= left; k<i; k++){
						temp += list[k]+" ";
					}
					temp += list[i];
					System.out.println("("+(left+1)+"-"+(i+1)+") that is {"+temp + "}");
				}
			}
		}
	}
	
}