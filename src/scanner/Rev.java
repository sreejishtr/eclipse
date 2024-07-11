package scanner;



public class Rev {

	public static void main(String[] args) {
		int rev=0;
		System.out.println("enter number");
		int num=456;
		
		while(num!=0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num/=10;
			
		}
		System.out.println("reversedno:"+rev);

	}

}
