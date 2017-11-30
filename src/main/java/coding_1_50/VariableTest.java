package coding_1_50;

//변수(Variable)의 개념
public class VariableTest {

	public static void main(String[] args){
		int a = 10;
		int b = 20;
		int c = a + b;
		
		System.out.println("1-- 합 10+20 = " +c);
		
		int d = 10;
		d = d + 20;
		System.out.println("2-- 합 10+20 = " +d);
		
		String str = "Hello World Java";
		System.out.println("3-- 문자열 출력 : " + str);
		
		// String Concatenation
		// 문자열 변수의 +는 문자열을 붙여서 새로운 문자열을 만들며, 이를 스트링 컨케트네이션이라고 한다.
		// 스트링 컨케트네이션은 왼쪽에서 오른쪽으로 진행된다. 
		// 문자열 덧셈은 모든 것을 문자열로 만든다.
		System.out.println("-- String Concatenation Test --");
		System.out.println(a + b + "합");
		System.out.println(a + "합" + b);
		System.out.println("합" + a + b);
		System.out.println("합" + (a + b));
	}
}
