package abstractt;
interface tvremote
{
	public void tv1();
}
interface smarttv extends tvremote
{
	public void smart();
}
class tv implements smarttv
{


	@Override
	public void smart() {
		// TODO Auto-generated method stub
		System.out.println("smart tv");
	}

	@Override
	public void tv1() {
		// TODO Auto-generated method stub
		System.out.println("normal tv");
	}
	
}


public class Interface2 {

	public static void main(String[] args) {
	tv ob=new tv();
	ob.smart();
	ob.tv1();

	}

}
