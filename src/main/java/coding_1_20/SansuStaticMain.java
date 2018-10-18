package coding_1_20;

public class SansuStaticMain {

	public final static int MEN = 3;
	public final static int WOMEN = 4;
	
	public static void main(String[] args){
		int people1 = WOMEN;  //4
		
		switch(people1){
			case 3 : System.out.println("���� ���α׷���"); break;
			case 4 : System.out.println("���� ���α׷���"); break;
		}
		
		//int SansuStatic.WOMAN = 5; //����� ������ �� ����. ����� ���� ������ �� ����
		int people2 = SansuStatic.WOMAN; //2
		
		switch(people2){
			case 1 : System.out.println("���� ������"); break;
			case 2 : System.out.println("���� ������"); break;
		}
	}
}
