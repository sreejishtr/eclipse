package scanner;

import java.util.Scanner;

public class Calcul {

	public static void main(String[] args) {
		System.out.println("enter 2 numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter choice:");
		char choice=sc.next().charAt(0);
		switch(choice)
		{
		case '+':System.out.println(a+b);
		break;
		case '-':System.out.println(a-b);
		break;
		case '*':System.out.println(a*b);
		break;
		case '/':System.out.println(a/b);
		break;
		default:System.out.println("invalid");
		break;
		}


	}

}
