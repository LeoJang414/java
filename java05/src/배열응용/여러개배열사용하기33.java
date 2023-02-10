package 배열응용;

import java.util.Scanner;

public class 여러개배열사용하기33 {

	public static void main(String[] args) {
		String[] tour1 = new String[3];
		String[] tour2 = new String[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < tour2.length; i++) {
			System.out.print("작년에 가고 싶었던 곳 세곳을 입력받아 넣으세요. 가고 싶었던 곳 " + (i + 1) + ")");
			tour1[i] = sc.next();
		}
		for (int i = 0; i < tour2.length; i++) {
			System.out.print("올해에 가고 싶은 곳 세곳을 입력받아 넣으세요. 가고 싶은 곳 " + (i + 1) + ")");
			tour2[i] = sc.next();
		}
		int count = 0;
		for (int i = 0; i < tour2.length; i++) {
			if (tour1[i].equals(tour2[i])) {
				count++;
			}
		}
		for (int i = 0; i < tour2.length; i++) {
			System.out.print(tour1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < tour2.length; i++) {
			System.out.print(tour2[i] + " ");
		}
		System.out.println();
		System.out.println("작년과 올해 가고 싶은 곳과 우선순위가 동일한 곳은 몇 곳인가?" + count);

		sc.close();
	}

}
