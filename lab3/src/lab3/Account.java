package lab3;

public abstract class Account implements Valuable {
	private double balance=0;
	
	public Account(double m) //������
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
	protected void setBalance(double m) //�ܾ׼���
	{
		balance=m;
	}
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int period);
}
