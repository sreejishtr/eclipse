package scanner;

import java.util.Scanner;

public class Caldowhile {

	public static void main(String[] args) {
		int choice;
		do
		{
		System.out.println("enter 2 numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println(a+b);
		break;
		case 2:System.out.println(a-b);
		break;
		case 3:System.out.println(a*b);
		break;
		case 4:System.out.println(a/b);
		break;
		default:System.out.println("invalid");
		break;
		}
		}
		while(choice>0 && choice<=4);

	}

}
