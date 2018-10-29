package coding_01_020;

/**
 * 013. �޼���
 * �Է¹��� ������ Ŀ�Ǹ� �� �� �� �� �ִ��� �����ϴ� �޼��带 �ۼ�����
 * �޼���(method)�� �����ϴ� ����� ����ϴ� ����� ������
 * Ŀ�ǰ��� 200���̸� �Էµ� ���� �׼��� �� ���� Ŀ�ǰ� ������ �� �� �ִ�.
 * 
 * @since 2017.12.30
 * @author Administrator
 *
 */
public class Coffee1Main{
	
	public static void main(String[] args){
		
		int myMoney = 800; // 800���� Ŀ�� �� ���ϱ�?
		int cups = 0;	   // �� �� ���ñ� �غ�
		
		if(myMoney > 0){
			cups = myMoney/200;	//Ŀ�� �� ��
		}else if(myMoney==0){
			cups = 0;
		}else{
			cups = -1;
		}
		
		if(cups > 0){
			System.out.println("Ŀ�� " + cups + " �� �Դϴ�.");
			System.out.printf("Ŀ�� %d �� �Դϴ�.", cups);
		}else{
			System.out.println("�׼��� ���ڶ��ϴ�.");
		}
	}
}
