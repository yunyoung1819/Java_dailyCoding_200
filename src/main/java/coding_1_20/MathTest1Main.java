package coding_1_20;

/**
 * 15. 기본 연산을 위한 메서드 (java.lang.Math)
 *
 */
public class MathTest1Main {
	public static void main(String[] args) {
		
		// constant
		System.out.println("1: Math.E" + Math.E);	// 자연로그 E
		System.out.println("2: Math.PI" + Math.PI);	// 원주율 PI
		
		// method
		System.out.println("3: Math.abs(-5) 절대값:" + Math.abs(-5));	// 절대값
	    System.out.println("4: Math.ceil(4.34) 올림:" + Math.ceil(4.34));	// 올림
	    System.out.println("5: Math.round(4.34) 반올림:" + Math.round(4.34));	// 반올림
	    System.out.println("6: Math.floor(4.34) 버림:" + Math.floor(4.34));	// 버림
	    System.out.println("7: Math.rint(4.34) 반올림:" + Math.rint(4.34));	//반올림
	    
	    System.out.println("8: Math.max(45,78)" + Math.max(45, 78));	// 최대값
	    System.out.println("9: Math.min(45,78)" + Math.min(45, 78));	// 최소값
	    
	    System.out.println("10: Math.pow(2,4)" + Math.pow(2, 4));	// 승수 pow(2,4)는 2의 4승
	    System.out.println("11: Math.log(30)" + Math.log(30));	// 밑수가 Math.E인 로그
	    System.out.println("12: Math.exp(3)" + Math.exp(3));	// exp는 자연 지수의 승수
	    System.out.println("13: Math.sqrt(10)" + Math.sqrt(10));	// 양의 제곱근
	   
	    System.out.println("14: Math.sin(Math.toRadians(90))");	// 도(degree)를 라디안(radian)으로 바꾼다
	    System.out.println(Math.sin(Math.toRadians(90)));	// 라디안을 sin 삼각함수에 입력한다. 삼각함수의 입력값은 라디안으로 바꿔야한다
	    
	    System.out.println("15: Math.cos(Math.toRadians(180))");             
	    System.out.println(Math.cos(Math.toRadians(180)));	// cos 삼각함수
	    
	    // random
	    double dRan = Math.random();	// 0 <== dRan < 1 실수
	    int iRan = (int)(Math.random()*100);	// 0 <== iRan <100 정수
	    System.out.println("16: Math.random() => " + dRan);
	    System.out.println("17: (int)(Math.random()*100) => " + iRan);
	} 
}
