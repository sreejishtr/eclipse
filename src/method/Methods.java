package method;

public class Methods {

	public static void main(String[] args) {
		Methods ob=new Methods();
		ob.add();
		ob.mul(5, 10);
		int value=ob.sub();
		System.out.println("sub="+value);
		

	}
       //1.method without parameter and returntype
	public  void add()
	{
		int a=34,b=16,c;
		c=a+b;
		System.out.println(c);
	}
	
	//2.method with returntype and without parameter
	public int sub()
	{
		int a=34,b=16,c;
		c=a-b;
		return c;
		
	}
	//3.without retuntype with parameters
	public void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("multiplication="+c);
	}
	//4.method with returntype and with parameter
	public double div(int a,int b)
	{
		double c=a/b;
		return c;
	}
}
