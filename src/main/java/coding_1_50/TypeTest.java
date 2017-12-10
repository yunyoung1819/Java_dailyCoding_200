package coding_1_50;

// 자바의 데이터 타입과 기본 타입

public class TypeTest{
	
	public static void main(String[] args){
		
		byte ba = 15;
		byte bb = 25;
		byte bc = 15+25;
		//byte bd = ba + bb; 
		// 정수 타입의 기본 타입은 int로, int보다 작은 타입은 각각의 범위 내에서는 값을 받을 수 있다
		// 변수로 넘겨주는 경우 자동으로 int가 된다. 따라서 캐스팅(타입 형 변환)이 필요하다
		byte be = (byte)(ba + bb);
		
		System.out.println("01 : " + bc); //40
		System.out.println("02 : " + be); //40
		
		short sa = 50;
		short sb = 50;
		short sc = 50 + 50;
		//short sd = sa + sb;  //타입 캐스팅 에러. 정수 타입의 기본 타입은 int로 변수로 넘겨주는 경우 자동으로 int가 된다. 
		short se = (short)(sa + sb);
		
		System.out.println("03 : " + sc); //100
		System.out.println("04 : " + se); //100
		
		int ia = 40;
		int ib = 70;
		int ic = 40 + 70;
		int id = ic + sa; //40 + 50 = 90. sa는 변수이므로 int 타입이 된다. 
		
		System.out.println("05 : " + ic); //110
		
		/* long은 int보다 큰 타입이다. long 타입을 선언하려면 l 또는 L이 필요하다 */
		long la = 40l;
		long lb = 50L;
		long lba = 50 + Integer.MAX_VALUE; 	  // (int + int) -> 쓰레기 값
		// l 또는 L을 붙이지 않았으므로 int가 된다. int 최대값에 int타입을 더한 결과 오버플로우(범위초과)가 나와 쓰레기 값이 된다.
		long lbb = 50L + Integer.MAX_VALUE;   //(long + int) -> 제대로된 연산이 된다.
		long lc = la + lb;
		
		System.out.println("06 : " + lba); //쓰레기값
		System.out.println("07 : " + lbb); //양수
		System.out.println("08 : " + lc);  //90
		
		float fa = 45.0f;
		float fb = 46.67F;
		float fc = (float) 30.4;  //f 또는 F가 없으면 LONG 타입이 된다
		float fd = 30;  //int는 자동으로 float가 된다
		float fe = fa + fb;  //45.0 + 46.67
		
		double da = 12;
		double db = 45 + Float.MAX_VALUE;
		double dc = da + db;
		
		System.out.println("09 : " + dc);
		
		System.out.println("10 : " + "byte 범위 : " + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("11 : " + "short 범위 : " + Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		
		System.out.println("12 : " + "int 범위 : " + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println("13 : " + "long 범위 : " + Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		
		System.out.println("14 : " + "float 양의 범위 : " + Float.MIN_VALUE + "~" + Float.MAX_VALUE);
		System.out.println("15 : " + "double 양의 범위 : " + Double.MIN_VALUE + "~" + Double.MAX_VALUE);
	}	
}

/* 출처 : 초보자를 위한 자바200제_정보문화사*/