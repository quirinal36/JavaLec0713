package lee.hyoung.gu.day3;

public class MainClass {
	public static void main(String[] args) {
		String phrase = "Always be with";
		
		String sub = phrase.substring(10);
		System.out.println(sub);
		
		sub = phrase.substring(7, 9);
		System.out.println(sub);
		
		
		
		/*
		Postcode postcode = new Postcode();
		for(String sCode : postcode.getArr()) {
			int code = Integer.parseInt(sCode.substring(0, 2));
			System.out.println("code : " + code);
			
			if(code > 0 && code < 10) {
				System.out.println("����");
			}else if(code >= 10 && code <= 20) {
				System.out.println("���");
			}else if(code <= 23){
				System.out.println("��õ");
			}else if(code <= 26) {
				System.out.println("����");
			}else if(code < 30) {
				System.out.println("���");
			}else if(code == 30) {
				System.out.println("���߽�");
			}else if(code <= 33) {
				System.out.println("�泲");
			}else if(code <= 35) {
				System.out.println("����");
			}else if(code <=40) {
				System.out.println("���");
			}else if(code <= 43) {
				System.out.println("�뱸");
			}else if(code <= 45) {
				System.out.println("���");
			}else if(code <= 49) {
				System.out.println("�λ�");
			}else if(code <= 53) {
				System.out.println("�泲");
			}else if(code <= 56) {
				System.out.println("����");
			}else if(code <= 60) {
				System.out.println("����");
			}else if(code <= 62) {
				System.out.println("����");
			}else if(code == 63) {
				System.out.println("����");
			}else {
				System.out.println("error");
			}
		}
		*/
	}
}
