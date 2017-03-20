package lab3;

public class checkingAccount extends Account {
	private double balance; 
	private double credit_limit,interest,loan_interest;
	
	public checkingAccount(double m)
	{
		super(m);
		
		balance=m;
		credit_limit=100; //�ѵ�
		interest=0.01; //������
		loan_interest=0.07; //��������
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
	
	public void nextMonth()
	{
		if(balance>0) balance+=balance*interest; //���� ����
		else balance+=balance*loan_interest; //�� �þ
	}
	
}
