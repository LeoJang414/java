package 상속;

public class CoffeeTruck extends Truck {
	int coffeeMaker;
	int seatNumber;
	
	public void coffeeMake() {
		System.out.println("커피를 만들다.");
	}
	
	@Override
	public void drive() {
		System.out.println("차가 움직여서 커피를 팔 장소로 이동하다.");
	}
	
	@Override
	public void carry() {
		// TODO Auto-generated method stub
		super.carry();
		System.out.println("커피를 싣고 이동하다.");
	}

	
	public String toString() {
		return "CoffeeTruck [coffeeMaker=" + coffeeMaker + ", seatNumber=" + seatNumber + ", weight=" + weight
				+ ", length=" + length + ", clr=" + clr + ", type=" + type + ", mileage=" + mileage + "]";
	}
	
	
}
