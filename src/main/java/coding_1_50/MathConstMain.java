package coding_1_50;

public class MathConstMain {
	public static void main(String[] args){
		
		System.out.println(Math.PI);	//원주율(pie 3.141592) 츨력
		System.out.println(Math.E);     //자연로그(e, 2.71828) 출력
		
		//원의 넓이 구하기
		double r = 10;
		double s = Math.PI * r * r; 	//원의 넓이 (s) = 원주율 X 반지름 X 반지름
		System.out.println("원의 넓이" + s);
	}
}
