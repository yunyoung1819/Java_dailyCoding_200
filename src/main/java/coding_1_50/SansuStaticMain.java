package coding_1_50;

public class SansuStaticMain {

	public final static int MEN = 3;
	public final static int WOMEN = 4;
	
	public static void main(String[] args){
		int people1 = WOMEN;  //4
		
		switch(people1){
			case 3 : System.out.println("남성 프로그래머"); break;
			case 4 : System.out.println("여성 프로그래머"); break;
		}
		
		//int SansuStatic.WOMAN = 5; //상수에 대입할 수 없음. 상수는 값을 변경할 수 없음
		int people2 = SansuStatic.WOMAN; //2
		
		switch(people2){
			case 1 : System.out.println("남성 연기자"); break;
			case 2 : System.out.println("여성 연기자"); break;
		}
	}
}
