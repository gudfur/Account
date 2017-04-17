package lab3;

public class Car implements Valuable{
	protected String name;
	protected double price;
	
	public Car(String name,double price){
		this.name=name;
		this.price=price;
	}
	public double estimateValue(int month){
		return price*0.8*Math.pow(0.99, month);
	}
	public double estimateValue(){
		return price*0.8*0.99;
	}
	public String toString(){
		return String.format("car name: %s\ninitial price: %.2f", name,price);
	}
}
