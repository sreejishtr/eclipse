package polymorphism;
class shaps
{
	public void draw()
	{
		System.out.println("draw any shape");
	}
}
class circle extends shaps
{

	@Override
	public void draw() {
		System.out.println("shape is circle");
		super.draw();
	}
	
}
public class Overriding {

	public static void main(String[] args) {
		circle ob=new circle();
		ob.draw();

	}
	

}
