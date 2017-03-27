package lab3;

public class SavingAccount extends Account{
	public double balance;
	public double interest;
	public int time; //계약기간 세는 변수
	
	public SavingAccount(double m, double i)
	{
		
		super(m);
		balance=m;
		interest=i;
		time=12;
	}
	@Override
	public void credit(double m)
	{
		balance+=m;
	}
	@Override
	public void debit(double m)
	{
		if(time>0) System.out.println("아직 출금할 수 없습니다.");
		else balance-=m;
	}
	@Override
	public double getBalance()
	{
		return balance;
	}
	@Override
	protected void setBalance(double m)
	{
		balance=m;
	}
	@Override
	public double getWithdrawableAccount()
	{		
		if(time!=0) return 0;
		else return balance;
	}
	@Override
	public void passTime(int month)
	{
		if(time>0)//계약기간 안 지난 상태
		{
			time-=month;
			balance = balance * Math.pow(1+interest,month);
		}
		
	}
}
