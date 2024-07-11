package encapsulation;
class employee
{ 
	String empname;
	int empid;
	public String getempname()
	{
		return empname;
	}
	public void setempname(String empname)
	{
		this.empname=empname;
	}
	public int getempid()
	{
		return empid;
	}
	public void setempid(int empid)
	{
		this.empid=empid;
	}
}






public class Encapulation {

	public static void main(String[] args) {
		employee ob=new employee();
		ob.setempid(101);
		ob.setempname("sree");
		System.out.println(ob.getempid());
		System.out.println(ob.getempname());

	}

}
