package abstractt;

import java.util.Scanner;

interface bank
{
	public void accountdeatils();
	public void balance();
	public void withdrawel();
	public void deposite();
}
class sbi implements bank{
           Scanner sc=new Scanner(System.in);
           static String bankname="sbi";
           int balance=1000;
	@Override
	public void accountdeatils() {
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter account number");
		long accountno=sc.nextLong();
		System.out.println("your name is"+name+" your account number="+accountno);
	}

	@Override
	public void balance() {
		System.out.println("balance amount="+balance);
	}

	@Override
	public void withdrawel() {
		System.out.println("enter withdrawel amount");
		int withdrawel=sc.nextInt();
		if(withdrawel<=balance)
		{
			balance=balance-withdrawel;
			System.out.println("balance amount is "+balance);
		}
		else
		{
			System.out.println("no sufficient balance");
		}
	}

	@Override
	public void deposite() {
		System.out.println("enter deposite amount");
		int deposite=sc.nextInt();
		balance=balance+deposite;
		System.out.println("final balance="+balance);
	}
	
}

public class Bankapp {

	public static void main(String[] args) {
		sbi ob=new sbi();
		ob.accountdeatils();
		ob.balance();
		ob.withdrawel();
		ob.deposite();

	}

}
