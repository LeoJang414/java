package 상속;

public class Truck extends Car {
	int weight;
	int length;
	
	public void carry() {
		System.out.println("물건을 싣고 이동하다.");
	}

	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", length=" + length + ", clr=" + clr + ", type=" + type + ", mileage="
				+ mileage + "]";
	}
}
