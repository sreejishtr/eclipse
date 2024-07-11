package scanner;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int rev=0;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		while(num!=0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num/=10;
			
		}
		System.out.println(rev);
		if(rev==temp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
