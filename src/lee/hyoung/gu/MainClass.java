package lee.hyoung.gu;

import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		/*
		Student hyoungGu = new Student();
		
		hyoungGu.setSeat(0);
		hyoungGu.setFirstName("��");
		hyoungGu.setPhone("0072");
		
		System.out.println(hyoungGu.getSeat());
		System.out.println(hyoungGu.getFirstName());
		System.out.println(hyoungGu.getPhone());
		
		
		�л� ���� = new �л�();
		����.set�ڸ���ȣ(0);
		����.set��("��");
		����.set��ȭ��ȣ("0072");
		
		System.out.println(����.get�ڸ���ȣ());
		System.out.println(����.get��());
		System.out.println(����.get��ȭ��ȣ());
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
