package coding_1_50;

import java.util.Scanner;

/**
 * Calculator_Level_0
 * 
 * Level 0 : 아주 기초적인 사칙 연산 JAVA 계산기
 * @since : 2017.12.21
 * @author : Yun Young
 * 
 */
public class Calculator_level_0 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번쨰 숫자 입력 : ");
		String input1 = sc.nextLine();
		
		System.out.println("+, -, *, / 중 하나를 입력하십시오");
		String operator = sc.nextLine();
		
		System.out.println("두번째 숫자 입력 : ");
		String input2 = sc.nextLine();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		if(operator.equals("+")){
			int result = num1 + num2;
			System.out.println("두 수의 덧셈 : " + result);
		}
		
		else if(operator.equals("-")){
			int result = num1 - num2;
			System.out.println("두 수의 뺄셈 : " + result);
		}
		
		else if(operator.equals("*")){
			int result = num1 * num2;
			System.out.println("두 수의 곱셈 : " + result);
		}
		
		else if(operator.equals("/")){
			int result = num1 / num2;
			System.out.println("두 수의 나눗셈 : " + result);
		}
	}
}
