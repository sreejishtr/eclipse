package inheritance;
class member
{
	String name;
	int age;
	int phoneno;
	String address;
	int salary;
	public void printdeatils()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phoneno="+phoneno);
		System.out.println("address="+address);
	}
}
class employee extends member
{
	String specialization;
	
	
}

class manger extends member
{
		
		String department;
	
}
public class Work1 {

	public static void main(String[] args) {
		
		employee ob=new employee();
		ob.name="sreejish";
		ob.age=24;
		ob.phoneno=1234567;
		ob.address="madamon";
		ob.printdeatils();
		System.out.println(ob.specialization="development");

		manger m=new manger();
		m.name="amal";
		m.age=26;
		m.phoneno=3567890;
		m.address="punaloor";
		m.printdeatils();
		System.out.println(m.department="IT");		
	}

}
