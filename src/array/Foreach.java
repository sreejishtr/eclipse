package array;

import java.util.Scanner;

public class Foreach {

	public static void main(String[] args) {
		String[] ar=new String[4];
		System.out.println("enter names");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			ar[i]=sc.next();
		}
		System.out.println("enterd names");
		for(String v:ar)
		{
			System.out.println(v);
		}

	}

}
