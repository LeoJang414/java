package 배열응용;

public class 우리반성적변동 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] term1 = { 44, 66, 77, 22, 11 };
		int[] term2 = { 33, 55, 77, 22, 40 };

		int count = 0;
		int count2 = 0;

		for (int i = 0; i < term2.length; i++) {
			System.out.println(term1[i] == term2[i]);
			if (term1[i] < term2[i]) {
				count++;
			} else if (term1[i] == term2[i]) {
				count2++;
			}
		}
		System.out.println(count);
		System.out.println(count2);
	}

}
