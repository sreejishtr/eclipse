package abstractt;
class monkey
{
	public void jump() {
		System.out.println("monkey jump");
	}
	public void bite() {
		System.out.println("monkey bite");
	}
}
interface basicanimal
{
	public void eat();
	public void sleep();
}
class human extends monkey implements basicanimal{

	@Override
	public void eat() {
	System.out.println("animal eat");
		
	}

	@Override
	public void sleep() {
		System.out.println("animal sleep");
		
	}
	public void speak() {
	System.out.println("human can speak");
}
}
public class Interface1 {

	public static void main(String[] args) {
		human ob=new human();
		ob.bite();
		ob.eat();
		ob.sleep();
		ob.jump();
		ob.speak();

	}

}

