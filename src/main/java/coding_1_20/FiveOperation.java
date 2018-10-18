package coding_1_20;

/** �⺻ ����� ���(print, printf)
 * 
 * ���� ����� print�� printf�� ����Ͽ� �������.
 * print�� ����� �� +�� ����ϰ�, printf�� %�� ,�� �̿��Ѵ�
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
		int iResultD = ia / ib;  // ��: 0
		int iResultE = ia % ib;  //������: 10 
		
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
		
		//¦��, Ȧ��
		int even = 4 % 2;
		int odd = 5 % 2;
		
		System.out.println("9 : " + even);
		System.out.println("10 : " + odd);
		
	} 
}
