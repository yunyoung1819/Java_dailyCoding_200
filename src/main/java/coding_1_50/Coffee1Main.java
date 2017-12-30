package coding_1_50;

/**
 * 013. 메서드
 * 입력받은 돈으로 커피를 몇 잔 살 수 있는지 리턴하는 메서드를 작성하자
 * 메서드(method)를 선언하는 방법과 사용하는 방법을 익히자
 * 커피값이 200원이면 입력된 돈의 액수로 몇 잔의 커피가 나올지 알 수 있다.
 * 
 * @since 2017.12.30
 * @author Administrator
 *
 */
public class Coffee1Main{
	
	public static void main(String[] args){
		
		int myMoney = 800; // 800원은 커피 몇 잔일까?
		int cups = 0;	   // 몇 잔 나올까 준비
		
		if(myMoney > 0){
			cups = myMoney/200;	//커피 몇 잔
		}else if(myMoney==0){
			cups = 0;
		}else{
			cups = -1;
		}
		
		if(cups > 0){
			System.out.println("커피 " + cups + " 잔 입니다.");
			System.out.printf("커피 %d 잔 입니다.", cups);
		}else{
			System.out.println("액수가 모자랍니다.");
		}
	}
}
