package coding_01_020;

public class NoStaticImportMain {
	public static void main(String[] args){
		
		double r = 10.0;
		double c = r * r * Math.PI; // ���� ����
		double d = Math.sqrt(4.4);  // 4.4�� ������ ���ϱ�
		double e = Math.pow(3, 3);  // 3�� 3�� ���ϱ�
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}
