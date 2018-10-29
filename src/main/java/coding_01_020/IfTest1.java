package coding_01_020;

/**
 * 문제 번호 : 017번
 * 문제 제목 : 간단한 조건문 if~else
 * 문제 내용: 짝수, 홀수, 윤년 여부를 판단해보자.
 * 학습 내용 : 짝수, 홀수, 윤년을 if 조건문을 이용하여 판단한다.
 * 힌트 내용: : 짝수는 2로 나누어 떨어진다. 짝수가 아니라면 홀수이다. 기본 타입은 == 로 비교한다.
 * 
 */
public class IfTest1 {
	
	public static void main(String[] args) {
		
		int year = 2018;
		
		if(year%2 == 0) {
			System.out.println(year + "는 짝수 해입니다.");
		}else {
			System.out.println(year + "는 홀수 해입니다.");
		}
		
	    if(year%2 != 1) {
	    	System.out.println(year + "는 짝수 해입니다.");
	    }else {
	    	System.out.println(year + "는 홀수 해입니다.");
	    }
	    
	    if(((year%4) == 0 && (year%100) != 0) || (year%400 == 0)) {
	    	System.out.println(year + "년은 윤년입니다.");
	    }else {
	    	System.out.println(year + "년은 윤년이 아닙니다.");
	    }
	}
}
