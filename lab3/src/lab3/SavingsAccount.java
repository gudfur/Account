package lab3;

public class SavingsAccount extends Account{
	private double balance;
	private double balance_initial;
	public double interest;
	public int time; //계약기간 세는 변수
	
	public SavingsAccount(double m, double i)
	{
		
		super(m);
		balance=m;
		balance_initial=m;
		interest=i;
		time=12;
	}
	@Override
	public void credit(double m)
	{
		balance+=m;
	}
	@Override
	public void debit(double m) throws Exception
	{
		if(time>0){
			throw new Exception("아직 출금할 수 없습니다.");
		}
		if(m<0) throw new Exception("음수입력!");
		else 
		{
			balance-=m;
		}
	}
	@Override
	public double getBalance() //잔액
	{
		if(time!=0) return balance_initial;
		return balance;
	}
	@Override
	protected void setBalance(double m)
	{
		balance=m;
	}
	@Override
	public double getWithdrawableAccount() //출금가능액
	{		
		if(time!=0) return 0;
		else
		{
			return balance;
		}
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
	public void passTime()
	{
		if(time>0)
		{
			time--;
			balance=balance*(1+interest);
		}
	}
	
	@Override
	public double estimateValue(int month) {
		return balance_initial*Math.pow(1+interest, month);
	}
	@Override
	public double estimateValue()
	{
		return balance_initial*(1+interest);
	}
	
	public String toString(){
		return String.format("SavingAccount_Balance: %.2f", balance);
	}
}
