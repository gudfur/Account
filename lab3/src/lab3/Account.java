package lab3;

public class Account {
	public double balance=0;
	
	public void credit(double m)
	{
		balance+=m;
	}
	public double getBalance()
	{
		return balance;
	}
	public void debit(double m)
	{
		balance-=m;
	}
}
