package coding_01_020;

/**
 * Created on 2017.11.30
 * �ּ� ���� �ҽ� <br>
 * javadoc - use HelloComment.java
 * @author �ʺ��ڸ� ���� �ڹ� 200��_������ȭ��
 *
 */
public class HelloComment {
	/**
	 * �ڼ����� �ƴ��� �Ǵ��ϴ� �޼���<br>
	 * <p>
	 * �ڼ��� 1�� �ڱ� �ڽ��� ������ ��� ���ε�
	 * ������ ����߸� �� ���� ��
	 * </p>
	 * �Ǵ��Ϸ��� �ϴ� <code>int</code>�� �Է��Ѵ�.<br>
	 * <pre>
	 * public boolean isPri(int a){
	 * 		boolean isP = true;
	 * 		int b = (int) Math.sqrt(a); //50�̸� 2���� 7����
	 * 		for(int i=2; i<=b; i++){
	 * 			if(a%i==0){		//(50,2)(50,3)(50,4)...
	 * 				isP=false;
	 * 				break; //for Ż��
	 * 			}else isP = true;
	 * 		}
	 * 		return isP;
	 * }
	 * </pre>
	 * @param a �ڼ����� �Ǵ��Ϸ��� �ϴ� �� <code>int</code>
	 * @return �ڼ� ���θ� ���� <code>boolean</code>
	 */
	public boolean isPri(int a){
		boolean isP=true;
		int b = (int)Math.sqrt(a);		//50�̸� 2���� 7����
		for(int i=2;i<=b;i++){
				if(a%i==0){
					isP=false;
					break;
				}else isP=true;
		}
		return isP;
	}
}
