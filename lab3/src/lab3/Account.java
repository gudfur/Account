package lab3;

import java.util.ArrayList;

public abstract class Account implements Valuable {
	private double balance=0;
	
	public Account(double m) //생성자
	{
		balance=m;
	}
	public void credit(double m)
	{
		balance+=m;
	}
	public void debit(double m) throws Exception
	{
		balance-=m;
	}
	public double getBalance()
	{
		return balance;
	}
	protected void setBalance(double m) //잔액수정
	{
		balance=m;
	}
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int period);
	public abstract void passTime();
	public static double sumForAccount(ArrayList<? extends Account> list){
		double sum=0;
		for(Account account : list){
			sum+=account.getBalance();
		}
		return sum;
	}
	public static void passTimeForList(ArrayList<? extends Account> list,int month){
		for(Account account : list){
			account.passTime(month);
		}
	}
}
