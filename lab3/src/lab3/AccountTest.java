package lab3;

import java.util.Scanner;

public class AccountTest {
	public static void main(String args[])
	{
		CheckingAccount a1=new CheckingAccount(100.0,50,0.01,0.07);
		SavingAccount a2=new SavingAccount(100.0,0.05);
		double amount;
		Scanner input=new Scanner(System.in);
		
		System.out.printf("Account1 balance: $%.2f\t",a1.getBalance());
		System.out.printf("현재출금가능액 : %.2f\n", a1.getWithdrawableAccount());
		System.out.printf("Enter withdrawal amount for Account1: ");
		amount=input.nextDouble();
		a1.debit(amount);
		
		System.out.printf("Account1 balance: $%.2f\t",a1.getBalance());
		System.out.printf("현재출금가능액 : %.2f\n", a1.getWithdrawableAccount());
		if(a1.isBankrupted()) System.out.println("account1 went Bankrupt!");
		System.out.println("1 Month later");
		a1.passTime(1);
		
		System.out.printf("Account1 balance: $%.2f\t",a1.getBalance());
		System.out.printf("현재출금가능액 : %.2f\n", a1.getWithdrawableAccount());
		if(a1.isBankrupted()) System.out.println("account1 went Bankrupt!");
		System.out.println("next 5 Month later");
		a1.passTime(5);
		
		System.out.printf("Account1 balance: $%.2f\t",a1.getBalance());
		System.out.printf("현재출금가능액 : %.2f\n", a1.getWithdrawableAccount());
		if(a1.isBankrupted()) System.out.println("account1 went Bankrupt!");
		
		System.out.println("");
		//saving account
		System.out.printf("Account2 balance: $%.2f\t",a2.getBalance());
		System.out.printf("현재출금가능액 : %.2f\n", a2.getWithdrawableAccount());
		System.out.println("6 Month later");
		a2.passTime(6);
		
		System.out.printf("Account2 balance: $%.2f\t",a2.getBalance());
		System.out.printf("현재출금가능액 : %.2f\n", a2.getWithdrawableAccount());
		a2.debit(50);
		System.out.println("next 6 Month later");
		a2.passTime(6);
		
		System.out.printf("Account2 balance: $%.2f\t",a2.getBalance());
		System.out.printf("현재출금가능액 : %.2f\n", a2.getWithdrawableAccount());
		System.out.println("next 1 Month later");
		a2.passTime(1);
		
		System.out.printf("Account2 balance: $%.2f\t",a2.getBalance());
		System.out.printf("현재출금가능액 : %.2f\n", a2.getWithdrawableAccount());
		a2.debit(50);
		
		System.out.printf("Account2 balance: $%.2f\t",a2.getBalance());
		System.out.printf("현재출금가능액 : %.2f\n", a2.getWithdrawableAccount());
	}
}
