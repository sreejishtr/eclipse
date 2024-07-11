package inheritance;
class a
{
	public void amethod()
	{
		System.out.println("sreejish");
	}
}
class b extends a
{
	public void bmethod()
	{
		System.out.println("amal");
	}
}
class c extends b
{
	public void cmethod()
	{
		System.out.println("athul");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		c ob=new c();
		ob.amethod();
		ob.bmethod();
		ob.cmethod();

	}

}
