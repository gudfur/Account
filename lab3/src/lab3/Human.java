package lab3;

public class Human implements Valuable{
	protected String name;
	protected int age;
	public Human(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public double EstimateValue(int month)
	{
		return Double.POSITIVE_INFINITY;
	}
	public String toString(){
		return String.format("Human name: %s\nregistered age: %d", name,age);
	}
}
