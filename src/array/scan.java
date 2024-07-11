package array;

import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		int[] ar=new int[3];
		System.out.println("enter numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("enterd numbers");
		for(int i=0;i<3;i++)
		{
			System.out.println(ar[i]);
		}

	}

}
