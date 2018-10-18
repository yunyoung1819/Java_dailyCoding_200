package coding_1_20;

/*
 * ����� ������ �ƴ� �ظ� �����ϱ�
 * 
 * ������ ���ϴ� ���
 * 1. ���� ��� ������ 4�� ������ �������� �ش� �켱 �������� �ϰ�,
 * 2. ���߿��� 100���� ������ �������� �ش� ������� �ϸ�
 * 3. �ٸ� 400���� ������ �������� �ش� �ٽ� �������� ���Ѵ�.
 */
public class IfLeapYearCalc {

	public static void main(String[] args){
		
		for(int year=1988; year<2019; year++){
			
			boolean yearTF=false;
			
			if((0==(year%4) && 0!=(year%100)) || 0==year%400){
				yearTF = true;
			}else{
				yearTF = false;
			}
			
			if(yearTF){
				System.out.println(year + "�� ����");
			}else{
				System.out.println(year + "�� ������ �ƴϴ�");
			}
		}//for
	}
}
