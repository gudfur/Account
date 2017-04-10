package lab3;

public class SavingAccount extends Account{
	public double balance;
	public double interest;
	public int time; //���Ⱓ ���� ����
	
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
	public void debit(double m) throws Exception
	{
		if(time>0){
			throw new Exception("���� ����� �� �����ϴ�.");
		}
		if(m<0) throw new Exception("�����Է�!");
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
		if(time>0)//���Ⱓ �� ���� ����
		{
			time-=month;
			balance = balance * Math.pow(1+interest,month);
		}
		
	}
	@Override
	public double EstimateValue(int month) {
		return balance * Math.pow(1+interest,month);
	}
	public String toString(){
		return String.format("SavingAccount_Balance: %.2f", balance);
	}
}
