package lab3;

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
	public void debit(double m)
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
}
