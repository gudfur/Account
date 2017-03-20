package lab3;

import java.util.Scanner;

public class AccountTest {
	public static void main(String args[])
	{
		Account a1=new Account();
		Account a2=new Account();
		double m1,m2;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter deposit amout for Account1 : ");
		m1=input.nextDouble();
		a1.credit(m1);
		
		System.out.printf("Account1 balance: %f\n",a1.getBalance());
		System.out.printf("Account2 balance: %f\n",a2.getBalance());
		
		System.out.print("Enter deposit amout for Account2 : ");
		m2=input.nextDouble();
		a2.credit(m2);
		
		System.out.printf("Account1 balance: %f\n",a1.getBalance());
		System.out.printf("Account2 balance: %f\n",a2.getBalance());
		
		System.out.print("Enter withdrawal amout for Account1 : ");
		m1=input.nextDouble();
		if(a1.getBalance()>m1) a1.debit(m1);
		else System.out.println("Cannot withdraw");
		
		System.out.printf("Account1 balance: %f\n",a1.getBalance());
		System.out.printf("Account2 balance: %f\n",a2.getBalance());
		
		System.out.print("Enter withdrawal amout for Account2 : ");
		m2=input.nextDouble();
		if(a2.getBalance()>m2) a2.debit(m2);
		else System.out.println("Cannot withdraw");
		
		System.out.printf("Account1 balance: %f\n",a1.getBalance());
		System.out.printf("Account2 balance: %f\n",a2.getBalance());
	}
}
