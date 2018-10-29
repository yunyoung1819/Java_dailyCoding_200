package coding_01_020;

// �ڹ��� ������ Ÿ�԰� �⺻ Ÿ��

public class TypeTest{
	
	public static void main(String[] args){
		
		byte ba = 15;
		byte bb = 25;
		byte bc = 15+25;
		//byte bd = ba + bb; 
		// ���� Ÿ���� �⺻ Ÿ���� int��, int���� ���� Ÿ���� ������ ���� �������� ���� ���� �� �ִ�
		// ������ �Ѱ��ִ� ��� �ڵ����� int�� �ȴ�. ���� ĳ����(Ÿ�� �� ��ȯ)�� �ʿ��ϴ�
		byte be = (byte)(ba + bb);
		
		System.out.println("01 : " + bc); //40
		System.out.println("02 : " + be); //40
		
		short sa = 50;
		short sb = 50;
		short sc = 50 + 50;
		//short sd = sa + sb;  //Ÿ�� ĳ���� ����. ���� Ÿ���� �⺻ Ÿ���� int�� ������ �Ѱ��ִ� ��� �ڵ����� int�� �ȴ�. 
		short se = (short)(sa + sb);
		
		System.out.println("03 : " + sc); //100
		System.out.println("04 : " + se); //100
		
		int ia = 40;
		int ib = 70;
		int ic = 40 + 70;
		int id = ic + sa; //40 + 50 = 90. sa�� �����̹Ƿ� int Ÿ���� �ȴ�. 
		
		System.out.println("05 : " + ic); //110
		
		/* long�� int���� ū Ÿ���̴�. long Ÿ���� �����Ϸ��� l �Ǵ� L�� �ʿ��ϴ� */
		long la = 40l;
		long lb = 50L;
		long lba = 50 + Integer.MAX_VALUE; 	  // (int + int) -> ������ ��
		// l �Ǵ� L�� ������ �ʾ����Ƿ� int�� �ȴ�. int �ִ밪�� intŸ���� ���� ��� �����÷ο�(�����ʰ�)�� ���� ������ ���� �ȴ�.
		long lbb = 50L + Integer.MAX_VALUE;   //(long + int) -> ����ε� ������ �ȴ�.
		long lc = la + lb;
		
		System.out.println("06 : " + lba); //�����Ⱚ
		System.out.println("07 : " + lbb); //���
		System.out.println("08 : " + lc);  //90
		
		float fa = 45.0f;
		float fb = 46.67F;
		float fc = (float) 30.4;  //f �Ǵ� F�� ������ LONG Ÿ���� �ȴ�
		float fd = 30;  //int�� �ڵ����� float�� �ȴ�
		float fe = fa + fb;  //45.0 + 46.67
		
		double da = 12;
		double db = 45 + Float.MAX_VALUE;
		double dc = da + db;
		
		System.out.println("09 : " + dc);
		
		System.out.println("10 : " + "byte ���� : " + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("11 : " + "short ���� : " + Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		
		System.out.println("12 : " + "int ���� : " + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println("13 : " + "long ���� : " + Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		
		System.out.println("14 : " + "float ���� ���� : " + Float.MIN_VALUE + "~" + Float.MAX_VALUE);
		System.out.println("15 : " + "double ���� ���� : " + Double.MIN_VALUE + "~" + Double.MAX_VALUE);
	}	
}

/* ��ó : �ʺ��ڸ� ���� �ڹ�200��_������ȭ��*/