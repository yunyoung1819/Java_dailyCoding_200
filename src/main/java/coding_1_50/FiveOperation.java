package coding_1_50;

/** 기본 연산과 출력(print, printf)
 * 
 * 연산 결과를 print와 printf를 사용하여 출력하자.
 * print는 출력할 때 +를 사용하고, printf는 %와 ,를 이용한다
 * @author Administrator
 *
 */
public class FiveOperation {

	public static void main(String[] args){
		
		int ia = 10;
		int ib = 20;
		
		double da = 69.67;
		double db = 34; 	// int -> double promotion 34 -> 34.0
		
		int iResultA = ia + ib;  //30
		int iResultB = ia - ib;  //-10
		int iResultC = ia * ib;  //200
		int iResultD = ia / ib;  // 몫: 0
		int iResultE = ia % ib;  //나머지: 10 
		
		System.out.println("1 : " + iResultA);
		System.out.println("2 : " + iResultB);
		System.out.println("3 : " + iResultC);
		System.out.println("4 : " + iResultD);
		System.out.println("5 : " + iResultE);
		
		double dResultA = da/db;
		double dResultB = da%db;
		double dc = (da-db * ((int)(da/db)));
		
		//da%db = (da-db * ((int)(da/db)))
		System.out.println("6 :" + dResultA);
		System.out.println("7 :" + dResultB);
		System.out.println("8 :" + dc);
		
		//짝수, 홀수
		int even = 4 % 2;
		int odd = 5 % 2;
		
		System.out.println("9 : " + even);
		System.out.println("10 : " + odd);
		
	} 
}
