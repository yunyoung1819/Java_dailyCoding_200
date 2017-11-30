package coding_1_50;

/*
 * 윤년과 윤년이 아닌 해를 구분하기
 * 
 * 윤년을 구하는 방법
 * 1. 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고,
 * 2. 그중에서 100으로 나누어 떨어지는 해는 평년으로 하며
 * 3. 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정한다.
 */
public class IfLeapYearCalc {

	public static void main(String[] args){
		
		for(int year=1988; year<2019; year++){
			
			boolean yearTF=false;
			
			if((0==(year%4) && 0!=(year%100)) || 0==year%400){
				yearTF = true;
			}else{
				yearTF = false;
			}
			
			if(yearTF){
				System.out.println(year + "는 윤년");
			}else{
				System.out.println(year + "는 윤년이 아니다");
			}
		}//for
	}
}
