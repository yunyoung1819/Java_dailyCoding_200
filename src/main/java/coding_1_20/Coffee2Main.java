package coding_1_20;

/** 013. �޼���
 * 
 */
public class Coffee2Main {
	
	public static void main(String[] args){
		
		int myMoneyA = 800;  // 800���� Ŀ�� �� ���ϱ�?
		int cupsA = Coffee2Main.coffee(myMoneyA);
		Coffee2Main.printCoffee(cupsA);
		
		int myMoneyB = 150;  // 150���� Ŀ�� �� ���ϱ�?
		int cupsB = coffee(myMoneyB);
		printCoffee(cupsB);
		
	} //main
	
	public static int coffee(int money){
		int cups = 0;  // �� �� ���ñ� �غ�
		
		if(money > 0){
			cups = money/200;
		}else if(money == 0){
			cups = 0;
		}else{
			cups = -1;
		}
		return cups;
	}  //coffee
	
	public static void printCoffee(int cups){
		if(cups > 0){
			System.out.println("Ŀ�� " + cups + " �� �Դϴ�.");
			//System.out.printf("Ŀ�� %d �� �Դϴ�.\n", cups);
		}else{
			System.out.println("�׼��� ���ڶ��ϴ�.");
		}
	} //printCoffee
}
