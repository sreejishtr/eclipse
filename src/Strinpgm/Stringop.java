package Strinpgm;

public class Stringop {

	public static void main(String[] args) {
	String s1="hai";
	String s2="sreejish";
	String s3="hello  welcome to luminor";
	String s4="Hai";
	//.concat
	System.out.println(s1.concat(s2));
	//equals
	System.out.println(s1.equals(s4));
	//equalsignorecase
	System.out.println(s1.equalsIgnoreCase(s4));
	//tolowercase
	//touppercase
	System.out.println(s4.toLowerCase());
	System.out.println(s1.toUpperCase());
	//length
	System.out.println(s1.length());
	//startwith and endwith
	System.out.println(s3.startsWith("hello"));
	System.out.println(s3.endsWith("luminor"));
	//trim
	System.out.println(s3.trim());
	//replace
	System.out.println(s3.replace("hello", "hai"));
	//contains
	System.out.println(s3.contains("welcome"));
	//split
	String[] ar=s3.split(" ");
	for(String a:ar)
	{
		System.out.println(a);
	}
	//SUBSTRING
	System.out.println(s2.substring(1,4));
	//charat
	System.out.println(s1.charAt(1));
	//tochararray
	char[] c=s1.toCharArray();
	for(char a:c)
	{
		System.out.println(a);
	}
	

	}

}
