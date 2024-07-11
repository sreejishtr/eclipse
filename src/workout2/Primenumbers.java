package workout2;

import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    if (n <= 1) {
	      System.out.println("The number is not prime");
	      return;
	    }
	    int count = 0;
	    int i = 1;
	    while (i <= n / 2) {
	      if (n % i == 0) {
	        count++;
	      }
	      i++;
	    }

	    if (count > 1) {
	      System.out.println("The number is not prime");
	    } else {
	      System.out.println("The number is prime");
	    }

	}

}
