package workout1;

import java.util.Scanner;

public class Countevanodd {

	public static void main(String[] args) {
		System.out.println("enter the array limit");
		Scanner sc=new Scanner(System.in);
	    int l=sc.nextInt(),i;
	    int count=0,count1=0;
	    int arr[]=new int[l];
	    System.out.println("enter the array");
	    for(i=0;i<l;i++)
	    {
	    	arr[i]=sc.nextInt();
	    	if(arr[i]%2==0)
	    	{
	    	count++;	
	    	}
	    	else
	    	{
	    		count1++;
	    	}
	    			
	    }
	    System.out.println("count evan numbers"+count);
	    System.out.println("count odd numbers"+count1);

	}

}
