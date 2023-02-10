package 배열응용;

import java.util.Scanner;

public class 여러개배열사용하기22 {

	public static void main(String[] args) {
		String[] names = { "홍길동", "이순신", "뉴진스", "방탄", "블랙핑크" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		int count = 0;
		int count2 = 0;

		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count++;
			} else if (term1[i] == term2[i]) {
				count2++;
			}
		} // for 1
		System.out.println("1. 2학기 성적이 오른 학생은 " + count);
		System.out.println("2. 1학기 2학기 성적이 동일한 학생은 " + count2);

		for (int j = 0; j < term2.length; j++) {
			if (term2[j] == 100) {
				System.out.println("3. 2학기 학생 중 만점인 학생의 이름과 번호는? " + names[j] + ", 학생의 인덱스는 " + j);
			}
		}
		int sum1 = 0;
		int sum2 = 0;
		for (int j2 = 0; j2 < term2.length; j2++) {
			sum1 = sum1 + term1[j2];
			sum2 = sum2 + term2[j2];
		}
		if (sum1 > sum2) {
			System.out.println("4. 1학기 평균 성적이 더 높았습니다.");
		} else if (sum1 < sum2) {
			System.out.println("4. 2학기 평균 성적이 더 높았습니다.");
		} else {
			System.out.println("4. 1학기 평균성적과 2학기 평균성적이 같습니다.");
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("성적이 궁금한 학생의 이름을 입력하세요.>>");
		String nms = sc.next();
		for (int i = 0; i < term2.length; i++) {
			if (names[i].equals(nms)) {
				System.out.println("5. " + names[i] + "의 1학기 성적은 " + term1[i] + ", 2학기 성적은 " + term2[i]);
			}
		}
		sc.close();
	}
}
