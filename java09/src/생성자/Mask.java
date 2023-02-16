package 생성자;

public class Mask {
	String clr;
	int price;
	int num;
	public Mask(String clr, int price, int num) {
		super();
		this.clr = clr;
		this.price = price;
		this.num = num;
	}
	@Override
	public String toString() {
		return "Mask [clr=" + clr + ", price=" + price + ", num=" + num + "]";
	}
	
	
}
