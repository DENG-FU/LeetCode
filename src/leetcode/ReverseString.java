package leetcode;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please input a string:");
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		String reverse = reverseString(string);
		System.out.println("The reversed result:"+reverse);
	}
	
	public static String reverseString(String s){
		if (s.length() <= 1){
			return s;
		} else {
			String left = s.substring(0, s.length()/2);
			String right = s.substring(s.length()/2, s.length());
			return reverseString(right)+reverseString(left);
		}
	}

}
