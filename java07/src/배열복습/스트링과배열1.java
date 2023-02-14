package 배열복습;

public class 스트링과배열1 {

	public static void main(String[] args) {
		// 스트링의 일부를 추출, 확인할때 사용하는 메소드
		String s = "나는 프로그래머프야";
		String s2 = "진짜!!";
		System.out.println(s + s2);
		System.out.println(s.concat(s2));
		System.out.println(s.charAt(0));
		char c = s.charAt(0);
		System.out.println(c);
		System.out.println(s.endsWith("야"));
		boolean result = s.endsWith("야");
		System.out.println(result);
		String result2 = s.substring(3);
		System.out.println(result2);
		String result3 = s.substring(3, 8);
		System.out.println(result3);
		boolean result4 = s.contains(s2);
		System.out.println(result4);
		int index = s.lastIndexOf("프");
		System.out.println(index);
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.replace("나", "너"));
	}

}
