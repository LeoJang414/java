package 상속;

public class Car {
	String clr;
	String type;
	int mileage;
	
	public void drive() {
		System.out.println("차가 움직이다.");
	}

	@Override
	public String toString() {
		return "Car [clr=" + clr + ", type=" + type + ", mileage=" + mileage + "]";
	}
	
}
