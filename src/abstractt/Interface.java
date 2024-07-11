package abstractt;
interface car1
{
	public void acceleration();
	public void speedlimit();	
}
class maruthi implements car1
{

	@Override
	public void acceleration() {
		// TODO Auto-generated method stub
		System.out.println("maruthi acc");
	}

	@Override
	public void speedlimit() {
		System.out.println("maruthi speed");
		
	}
	
}
class honda implements car1
{

	@Override
	public void acceleration() {
		System.out.println("honda acc");
		
	}

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
		System.out.println("honda speed");
	}
	
}




public class Interface {

	public static void main(String[] args) {
		maruthi ob=new maruthi();
		ob.acceleration();
		ob.speedlimit();
		honda b=new honda();
		b.acceleration();
		b.speedlimit();

	}

}
