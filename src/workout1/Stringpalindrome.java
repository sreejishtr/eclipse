package workout1;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		String reverseStr = "";
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
	      
	      

	}

}
