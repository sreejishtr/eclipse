package controlstt;

public class Calu {

	public static void main(String[] args) {
		int a=1,b=2;
		char operator='%';
		switch(operator)
		{
		case '+':System.out.println(a+b);
		break;
		case '-':System.out.println(a-b);
		break;
		case '*':System.out.println(a*b);
		break;
		case '/':System.out.println(a/b);
		break;
		default:System.out.println("invalid");
		break;
		}

	}

}
