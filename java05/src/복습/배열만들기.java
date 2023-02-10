package 복습;

import java.util.Iterator;

public class 배열만들기 {
	public static void main(String[] args) {
		String[] hobby = {"cycle", "movie", "book", "PT"};
		System.out.println(hobby);
		System.out.println("0 " + hobby[0]);
		System.out.println("1 " + hobby[1]);
		System.out.println(hobby.length);
		System.out.println(hobby[hobby.length - 1]);
		for (int i = 0; i < hobby.length; i++) {
//			i ==> index의역할, 0, 1, 2
			System.out.println(i + ": " + hobby[i]);
		}
		
		for (String x : hobby) {
			System.out.println(x);
		}
		
		String[] jobs = new String[5];
		System.out.println(jobs);
		jobs[0] = "pilot";
		jobs[1] = "programmer";
		System.out.println(jobs[0]);
		System.out.println(jobs[1]);
		System.out.println(jobs[4]);
		System.out.println(jobs[jobs.length -1]);
		for (int i = 0; i < jobs.length; i++) {
			System.out.println(i + ": " + jobs[i]);
		for (String x : jobs) {
			System.out.println(x);
			
		}	
		}
	}
}
