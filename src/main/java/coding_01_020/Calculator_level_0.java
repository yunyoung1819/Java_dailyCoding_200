package coding_01_020;

import java.util.Scanner;

/**
 * Calculator_Level_0
 * 
 * Level 0 : ���� �������� ��Ģ ���� JAVA ����
 * @since : 2017.12.21
 * @author : Yun Young
 * 
 */
public class Calculator_level_0 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù���� ���� �Է� : ");
		String input1 = sc.nextLine();
		
		System.out.println("+, -, *, / �� �ϳ��� �Է��Ͻʽÿ�");
		String operator = sc.nextLine();
		
		System.out.println("�ι�° ���� �Է� : ");
		String input2 = sc.nextLine();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		if(operator.equals("+")){
			int result = num1 + num2;
			System.out.println("�� ���� ���� : " + result);
		}
		
		else if(operator.equals("-")){
			int result = num1 - num2;
			System.out.println("�� ���� ���� : " + result);
		}
		
		else if(operator.equals("*")){
			int result = num1 * num2;
			System.out.println("�� ���� ���� : " + result);
		}
		
		else if(operator.equals("/")){
			int result = num1 / num2;
			System.out.println("�� ���� ������ : " + result);
		}
	}
}
