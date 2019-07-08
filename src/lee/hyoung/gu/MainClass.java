package lee.hyoung.gu;

import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		/*
		Student hyoungGu = new Student();
		
		hyoungGu.setSeat(0);
		hyoungGu.setFirstName("이");
		hyoungGu.setPhone("0072");
		
		System.out.println(hyoungGu.getSeat());
		System.out.println(hyoungGu.getFirstName());
		System.out.println(hyoungGu.getPhone());
		
		
		학생 형구 = new 학생();
		형구.set자리번호(0);
		형구.set성("이");
		형구.set전화번호("0072");
		
		System.out.println(형구.get자리번호());
		System.out.println(형구.get성());
		System.out.println(형구.get전화번호());
		*/
		
		int[] scores = new int[10];
		Random random = new Random(11);
		for(int i=0 ; i<10; i++) {
			scores[i] = 50 + random.nextInt(50);
//			System.out.println(scores[i]);
		}
		
		for(int score : scores) {
			System.out.println(score);
			if(score >= 90) {
				System.out.println("A");
			}else if(score >= 80) {
				System.out.println("B");
			}else if(score >= 70) {
				System.out.println("C");
			}else if(score >= 60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}
	}
}
