package coding_1_50;

/**
 * 014. 메서드 아규먼트
 * 
 * @since 2017.12.31
 * @author Administrator
 * 
 * 문제내용 : 커피값이 인상될 경우를 고려하여 입력한 돈으로 살 수 있는 커피의 수를 리턴하는 메서드를 작성
 * 학습내용 : 메서드의 아규먼트(argumnet) 사용법을 익힌다.
 * 힌트내용 : 커피값을 모르므로 돈의 액수와 커피값을 입력받아야 몇 잔을 살 수 있는지 알 수 있다.
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
		System.out.println("noChange는 " + noChange + "다.");
		
		String sChange = "young";
		coffeeIn(sChange);
		System.out.println("main : ");
		System.out.println("sChange는 " + sChange + "다.");
	}  //main
	
	public static void coffeeIn(int money){
		money+=300;
		money/=50;
		
		System.out.print("method coffeeIn : ");
		System.out.println("money는 " + money + "원이다.");
		System.out.printf("money는 %d 원이다.", money);
	} // coffeeIn
	
	public static void coffeeIn(String money){  // 오버로딩
		money = money.replace('y', 'Y');
		money += "안녕";  //메서드 안에서만 바귀고 메서드 밖에서는 바뀌지 않는다.
		
		System.out.print("method coffeeIn : ");
		System.out.println("money는 " + money + "다.");
	}  //coffeeIn
	
	public static int coffee(int money, int coffeeValue){
		if(coffeeValue <= 100){  //커피값이 100원 이하일 때
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
			System.out.println("커피 " + cups + "잔 입니다.");
			System.out.printf("커피 %d 잔 입니다.", cups);
		}else{
			System.out.println("액수가 모자랍니다.");
		}
	} //printCoffee
}
