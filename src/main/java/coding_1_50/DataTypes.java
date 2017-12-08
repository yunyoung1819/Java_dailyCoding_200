package coding_1_50;

/*
 * 데이터 타입 (자료 타입)
 * 데이터 타입에는 기본 타입과 참조 타입이 있다
 * 기본 타입에는 byte, short, char, int, long, float, double, boolean(true, false)가 있다
 */
public class DataTypes {

	public static void main(String[] args){
		
		// 기본 타입
		int primitiveInt = 31;
		double primitiveLong = 5.1321902;
		
		// 참조타입
		String refStr = "Global Programmar!";
		Object refObj = new Object();
		
		// 랩퍼 클래스
		Integer intWrap = new Integer(31);
		Double doubleWrap = new Double(5.1321902);
		
		// 배열
		int[] a= {1,2,3,4,5,6,7};
		
		System.out.println("1 :" + primitiveInt);
		System.out.println("2 :" + primitiveLong);
		System.out.println("3 :" + refStr);
		
		System.out.println("4 :" + refStr.indexOf('b')); //3
		System.out.println("5 :" + refStr.hashCode());
		System.out.println("6 :" + refObj);
		
		System.out.println("7 :" + refObj.getClass());
		System.out.println("8 :" + refObj.hashCode());
		System.out.println("9 :" + intWrap);
		
		System.out.println("10 :" + intWrap.intValue());
		System.out.println("11 :" + doubleWrap);
		System.out.println("12 :" + doubleWrap.doubleValue());
		
		System.out.println("13 :" + a);
		System.out.println("14 :" + a.length);
		System.out.println("15 :" + a[1]);
	}
}
