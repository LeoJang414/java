package 조건문;

public class IF문3 {

	public static void main(String[] args) {
		int x = 99;
		
		if (x >= 80) {
			System.out.println("최우수");
		} else if (x >= 70){
			System.out.println("우수");
		} else if (x >= 60) {
			System.out.println("보통");
		} else {
			System.out.println("미달");
		}
		
		int y = 10;
				
		switch (y) {
		case 10:
			System.out.println("VVIP");
			break;
		case 6:
			System.out.println("VIP");
			break;
		default:
			System.out.println("Normal");
		}
		
		
	}

}
