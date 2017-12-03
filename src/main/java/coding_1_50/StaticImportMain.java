package coding_1_50;

import static java.lang.Math.*;

public class StaticImportMain {   // JAVA5 부터
	public static void main(String[] args){
		
		// 다른 클래스의 상수를 사용하려면 '클래스 이름.상수'의 형식을 이용
		// static imports를 사용하면 클래스 이름을 사용하지 않아도 된다.
		double r = 10.0;
		double c = r * r * PI;
		double d = sqrt(2.4);
		double e = pow(2,3);
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}
}
