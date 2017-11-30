package coding_1_50;

/**
 * Created on 2017.11.30
 * 주석 사용법 소스 <br>
 * javadoc - use HelloComment.java
 * @author 초보자를 위한 자바 200제_정보문화사
 *
 */
public class HelloComment {
	/**
	 * 솟수인지 아닌지 판단하는 메서드<br>
	 * <p>
	 * 솟수는 1과 자기 자신을 제외한 어떠한 수로도
	 * 나누어 떨어뜨릴 수 없는 것
	 * </p>
	 * 판단하려고 하는 <code>int</code>를 입력한다.<br>
	 * <pre>
	 * public boolean isPri(int a){
	 * 		boolean isP = true;
	 * 		int b = (int) Math.sqrt(a); //50이면 2부터 7까지
	 * 		for(int i=2; i<=b; i++){
	 * 			if(a%i==0){		//(50,2)(50,3)(50,4)...
	 * 				isP=false;
	 * 				break; //for 탈출
	 * 			}else isP = true;
	 * 		}
	 * 		return isP;
	 * }
	 * </pre>
	 * @param a 솟수인지 판단하려고 하는 수 <code>int</code>
	 * @return 솟수 여부를 리턴 <code>boolean</code>
	 */
	public boolean isPri(int a){
		boolean isP=true;
		int b = (int)Math.sqrt(a);		//50이면 2부터 7까지
		for(int i=2;i<=b;i++){
				if(a%i==0){
					isP=false;
					break;
				}else isP=true;
		}
		return isP;
	}
}
