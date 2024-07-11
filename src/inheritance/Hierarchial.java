package inheritance;
class animal
{
	public void animalmethod()
	{
		System.out.println("animals");
	}
}
class tiger extends animal
{
	public void tigermethod()
	{
		System.out.println("tiger");
	}
}
class lion extends animal
{
	public void lionmethod()
	{
		System.out.println("lion");
	}
}
public class Hierarchial {

	public static void main(String[] args) {
		tiger ob=new tiger();
		ob.animalmethod();
		ob.tigermethod();
		lion l=new lion();
		l.animalmethod();
		l.lionmethod();

	}

}
