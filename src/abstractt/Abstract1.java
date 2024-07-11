package abstractt;
abstract class car
{
	abstract public void acceleration();
	abstract public void speedlimit();
	
}
class kia extends car
{

	@Override
	public void acceleration() {
		System.out.println("kia acceleration");
		
	}

	@Override
	public void speedlimit() {
		System.out.println("kia speed");
		
	}
	
}
class bmw extends car
{

	@Override
	public void acceleration() {
		System.out.println("bmw acceleration");
		
	}

	@Override
	public void speedlimit() {
	 System.out.println("bmw speed");
		
	}
	
}
public class Abstract1 {

	public static void main(String[] args) {
		kia ob=new kia();
		ob.acceleration();
		ob.speedlimit();
		bmw b=new bmw();
		b.acceleration();
		b.speedlimit();

	}

}
