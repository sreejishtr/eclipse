package workout1;

import java.util.Scanner;

public class Largearray {

	public static void main(String[] args) {
		System.out.println("input length of array");
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int arr[]=new int[l];
		int large=0,i;
		System.out.println("input array");	
		for(i=0;i<l-1;i++)
		{
		arr[i]=sc.nextInt();
		if(large<arr[i])
		{
			large=arr[i];
		}
		}
		System.out.println("larger number is"+large);
		}

}
