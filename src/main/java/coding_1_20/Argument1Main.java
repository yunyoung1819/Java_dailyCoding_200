package coding_1_20;

/**
 * 014. �޼��� �ƱԸ�Ʈ
 * 
 * @since 2017.12.31
 * @author Administrator
 * 
 * �������� : Ŀ�ǰ��� �λ�� ��츦 ����Ͽ� �Է��� ������ �� �� �ִ� Ŀ���� ���� �����ϴ� �޼��带 �ۼ�
 * �н����� : �޼����� �ƱԸ�Ʈ(argumnet) ������ ������.
 * ��Ʈ���� : Ŀ�ǰ��� �𸣹Ƿ� ���� �׼��� Ŀ�ǰ��� �Է¹޾ƾ� �� ���� �� �� �ִ��� �� �� �ִ�.
 *
 */
public class Argument1Main{
	
	public static void main(String[] args){
		int myMoney = 500;
		int cups = coffee(myMoney, 300);
		printCoffee(cups);
		
		int noChange = 400;
		coffeeIn(noChange);
		
		System.out.println("main : ");
		System.out.println("noChange�� " + noChange + "��.");
		
		String sChange = "young";
		coffeeIn(sChange);
		System.out.println("main : ");
		System.out.println("sChange�� " + sChange + "��.");
	}  //main
	
	public static void coffeeIn(int money){
		money+=300;
		money/=50;
		
		System.out.print("method coffeeIn : ");
		System.out.println("money�� " + money + "���̴�.");
		System.out.printf("money�� %d ���̴�.", money);
	} // coffeeIn
	
	public static void coffeeIn(String money){  // �����ε�
		money = money.replace('y', 'Y');
		money += "�ȳ�";  //�޼��� �ȿ����� �ٱͰ� �޼��� �ۿ����� �ٲ��� �ʴ´�.
		
		System.out.print("method coffeeIn : ");
		System.out.println("money�� " + money + "��.");
	}  //coffeeIn
	
	public static int coffee(int money, int coffeeValue){
		if(coffeeValue <= 100){  //Ŀ�ǰ��� 100�� ������ ��
			return -1;
		}
		
		int cups = -1;
		if(money > 0){
			cups = money/coffeeValue;
		}
		return cups;
	} //coffee
	
	public static int coffee(int money){
		return coffee(money, 200);
	} //coffee
	
	public static void printCoffee(int cups){
		if(cups > 0){
			System.out.println("Ŀ�� " + cups + "�� �Դϴ�.");
			System.out.printf("Ŀ�� %d �� �Դϴ�.", cups);
		}else{
			System.out.println("�׼��� ���ڶ��ϴ�.");
		}
	} //printCoffee
}
