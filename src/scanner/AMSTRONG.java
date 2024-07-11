package scanner;

import java.util.Scanner;

public class AMSTRONG {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int orginal,reminder,result=0;
		orginal=num;
		while(orginal !=0)
		{
			reminder=orginal%10;
			result+=Math.pow(reminder, 3);
			orginal/=10;
			
		}
		if(result==num)
		{
			System.out.println("number is amstrong");
		}
		else
		{
			System.out.println("not amstrong");
		}

	}

}
