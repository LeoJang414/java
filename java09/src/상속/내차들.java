package 상속;

public class 내차들 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.clr = "white";
		c1.mileage = 70000;
		c1.type = "sedan";
		c1.drive();
		
		Truck t1 = new Truck();
		t1.length = 3;
		t1.weight = 4;
		t1.clr = "blue";
		t1.drive();
		t1.carry();
		
		CoffeeTruck ct1 = new CoffeeTruck();
		ct1.clr = "yellow";
		ct1.mileage = 30000;
		ct1.weight = 3;
		ct1.carry();
		ct1.drive();
		ct1.coffeeMake();
	}

}
