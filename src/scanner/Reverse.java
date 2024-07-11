package scanner;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int rev=0;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num!=0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num/=10;
			
		}
		System.out.println("reversedno:"+rev);

	}

}
