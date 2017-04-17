package lab3;

public class ValuableTest {
	public static void main(String args[]){
		Valuable[] objectList=new Valuable[4];
		
		objectList[0]=new CheckingAccount(100,50,0.01,0.07);
		objectList[1]=new SavingsAccount(100,0.05);
		objectList[2]=new Human("Mark",20);
		objectList[3]=new Car("MyCar",5000);
		
		for(Valuable objectItem:objectList)
		{
			System.out.printf("%s\n", objectItem.toString());
			System.out.printf("1 month later Value (Method Overloading, no parameter) : %.2f\n",objectItem.estimateValue());
			System.out.printf("5 month later Valuable : %.2f\n\n", objectItem.estimateValue(5));
		}
		
	}
}
