package workout1;

import java.util.Scanner;

public class Countword {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String words = sc.nextLine();
		int count = words.split(" ").length;
		System.out.println(count);

	}

}
