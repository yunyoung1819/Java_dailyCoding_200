package coding_01_020;

//����(Variable)�� ����
public class VariableTest {

	public static void main(String[] args){
		int a = 10;
		int b = 20;
		int c = a + b;
		
		System.out.println("1-- �� 10+20 = " +c);
		
		int d = 10;
		d = d + 20;
		System.out.println("2-- �� 10+20 = " +d);
		
		String str = "Hello World Java";
		System.out.println("3-- ���ڿ� ��� : " + str);
		
		// String Concatenation
		// ���ڿ� ������ +�� ���ڿ��� �ٿ��� ���ο� ���ڿ��� �����, �̸� ��Ʈ�� ����Ʈ���̼��̶�� �Ѵ�.
		// ��Ʈ�� ����Ʈ���̼��� ���ʿ��� ���������� ����ȴ�. 
		// ���ڿ� ������ ��� ���� ���ڿ��� �����.
		System.out.println("-- String Concatenation Test --");
		System.out.println(a + b + "��");
		System.out.println(a + "��" + b);
		System.out.println("��" + a + b);
		System.out.println("��" + (a + b));
	}
}
