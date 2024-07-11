package polymorphism;

public class Overloading {

	public static void main(String[] args) {
	Overloading ob=new Overloading();
	ob.add();
	ob.add(100, 50);
    ob.add(100, 10.5);
    ob.add(20.2, 2);
	}
	public void add()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
		}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}


}
