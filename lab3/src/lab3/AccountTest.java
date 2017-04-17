package lab3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTest {
	public static void main(String args[])
	{
		CheckingAccount a1=new CheckingAccount(100.0,50,0.01,0.07);
		SavingsAccount a2=new SavingsAccount(100.0,0.05);
		double amount;
		
		Scanner scan=new Scanner(System.in);
		
		try{	
			System.out.print("Enter deposit amount for Account1: ");
			amount=scan.nextDouble();
			a1.debit(amount);
			System.out.println("Account1 balance: $"+a1.getBalance());
			
			System.out.print("Enter deposit amount for Account2: ");
			amount=scan.nextDouble();
			a2.debit(amount);
			System.out.println("Account2 balance: $"+a2.getBalance());
		} catch(InputMismatchException e){//알파벳입력
			System.out.println("예외발생 : 숫자를 입력하세요\n"+e.toString());
		} catch(Exception e){
			System.out.println("예외발생   "+e.toString());
		} finally {
			a1.passTime(2);
			System.out.println("2 month later account1 : "+a1.getBalance());
		}
/*		Scanner input=new Scanner(System.in);
		
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
		System.out.printf("현재출금가능액 : %.2f\n", a2.getWithdrawableAccount());*/
	}
}
