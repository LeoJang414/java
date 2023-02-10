package 배열응용;

public class 여러개배열사용하기1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fam = { "아버지", "어머니", "형", "나" };
		int[] age = { 100, 50, 30, 20 };
		double[] height = { 175.5, 150.5, 180.5, 165.5 };
		System.out.println("우리집 식구 정리");
		System.out.println("-------------------------");
		System.out.println("이름\t나이\t키");
		System.out.println("-------------------------");
		for (int i = 0; i < height.length; i++) {
			System.out.println(fam[i] + "\t" + age[i] + "\t" + height[i]);
			
		}
	}

}
