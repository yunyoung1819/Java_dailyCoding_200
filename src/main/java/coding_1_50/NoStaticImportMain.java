package coding_1_50;

public class NoStaticImportMain {
	public static void main(String[] args){
		
		double r = 10.0;
		double c = r * r * Math.PI; // 원의 넓이
		double d = Math.sqrt(4.4);  // 4.4의 제곱근 구하기
		double e = Math.pow(3, 3);  // 3의 3승 구하기
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}
