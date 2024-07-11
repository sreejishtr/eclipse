package workout1;

public class String1 {

	public static void main(String[] args) {
		String s="Testing Training Center";
		System.out.println(s);
		String str[]=s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}
		}

}
