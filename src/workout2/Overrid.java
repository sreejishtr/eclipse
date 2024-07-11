package workout2;

class  vehicle
{
	public void drive()
	{
		
	}
}
class car extends vehicle
{

	@Override
	public void drive() {
		System.out.println("repairing a car");
		super.drive();
	}
	
}




public class Overrid {

	public static void main(String[] args) {
		car ob=new car();
		ob.drive();

	}

}
