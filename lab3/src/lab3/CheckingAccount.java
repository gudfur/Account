package lab3;

public class CheckingAccount extends Account {
	private double balance; 
	private double credit_limit,interest,loan_interest;
	
	public CheckingAccount(double m)
	{
		super(m);
		
		balance=m;
		credit_limit=100; //�ѵ�
		interest=0.01; //������
		loan_interest=0.07; //��������
	}
	public CheckingAccount(double m,double cl,double i,double li)
	{
		super(m);
		
		balance=m;
		credit_limit=cl;
		interest=i;
		loan_interest=li;
	}
	public boolean isBankrupted()
	{
		if(balance<credit_limit*(-1)) return true;
		else return false;
	}
	@Override
	public void debit(double m)
	{
		if(balance-m<credit_limit*(-1)) 
			System.out.println("Over limit");
		else balance-=m;
	}
	@Override
	public double getBalance()
	{
		return balance;
	}
	@Override
	public void credit(double m)
	{
		balance+=m;
	}
	@Override
	public void passTime(int month)
	{
		if(balance>0) balance+=balance*(interest*month); //���� ����
		else balance+=balance*(loan_interest*month); //�� �þ
	}
	@Override
	public double getWithdrawableAccount() {
		if(credit_limit<balance*(-1)) return 0;
		else return credit_limit - balance*(-1);
	}
	
}
