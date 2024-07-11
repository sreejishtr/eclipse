package workout1;

import java.util.Scanner;

public class Countchar {

	public static void main(String[] args) {
		int count=0;
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i = 0; i < s.length(); i++) {    
            if(s.charAt(i) != ' ')    
                count++;    
        }  
		System.out.println("string count="+count);

	}

}
