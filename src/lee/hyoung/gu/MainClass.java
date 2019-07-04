package lee.hyoung.gu;

public class MainClass {

	public static void main(String[] args) {
		
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
	}
}
