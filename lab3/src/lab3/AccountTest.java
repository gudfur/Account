package lab3;

import java.util.Scanner;

public class AccountTest {
	public static void main(String args[])
	{
		checkingAccount a1=new checkingAccount(100.0);
		checkingAccount a2=new checkingAccount(100.0);
		double m1,m2;
		Scanner input=new Scanner(System.in);
		
		System.out.printf("Account1 balance: $%f\n",a1.getBalance());
		System.out.printf("Account2 balance: $%f\n",a2.getBalance());
		
		System.out.print("Enter deposit amout for Account1 : ");
		m1=input.nextDouble();
		a1.credit(m1);
		
		System.out.printf("\nAccount1 balance: $%f\n",a1.getBalance());
		System.out.printf("Account2 balance: $%f\n",a2.getBalance());
		
		System.out.print("Enter withdrawal amout for Account2 : ");
		m2=input.nextDouble();
		a2.debit(m2);
		
		System.out.printf("\nAccount1 balance: $%f\n",a1.getBalance());
		System.out.printf("Account2 balance: $%f\n",a2.getBalance());
		
		a1.nextMonth();
		a2.nextMonth();
		
		System.out.println("\nnext month!");
		System.out.printf("Account1 balance: $%f\n",a1.getBalance());
		System.out.printf("Account2 balance: $%f\n",a2.getBalance());
	}
}
