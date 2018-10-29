package coding_01_020;

import static java.lang.Math.*;

public class StaticImportMain {   // JAVA5 ����
	public static void main(String[] args){
		
		// �ٸ� Ŭ������ ����� ����Ϸ��� 'Ŭ���� �̸�.���'�� ������ �̿�
		// static imports�� ����ϸ� Ŭ���� �̸��� ������� �ʾƵ� �ȴ�.
		double r = 10.0;
		double c = r * r * PI;
		double d = sqrt(2.4);
		double e = pow(2,3);
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}
}
