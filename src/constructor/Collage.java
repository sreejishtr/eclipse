package constructor;

public class Collage {
	int stuid;
	String stuname;
	int stuage;
public Collage(int stuid,String stuname,int stuage)
{
	this.stuid=stuid;
	this.stuname=stuname;
	this.stuage=stuage;
}
	public static void main(String[] args) {
		Collage deatils=new Collage(100,"sreejish",24);
		System.out.println("id="+deatils.stuid);
		System.out.println("name="+deatils.stuname);
		System.out.println("age="+deatils.stuage);

	}

}
