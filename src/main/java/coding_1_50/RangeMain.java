package coding_1_50;

public class RangeMain{
	public static void main(String[] args){
		{ //���ۺ�� D
			int d=10;
			{ //���ۺ�� C
				int c=20;
				{ //���ۺ�� B
					int b=30;
					{ //���ۺ�� A
						int a=40;
						// a,b,c,d ��� ��� ����
						a=200;
						b=1000;
						c=2000;
						d=50;
						System.out.println("1 : "+a+" "+b+" "+c+" "+d);
						System.out.printf("1 : %d %d %d %d\n", a,b,c,d);
					} //end A
					b=200;
					c=300;
					d=60;
					//b, c, d�� �� �� �ִ�
					System.out.println("2 : " +b+" "+c+ " "+d);
					System.out.printf("2 : %d %d %d\n", b,c,d);
				} //end B
				c=300;
				d=70;
				//c,d�� �� �� �ִ�
				System.out.println("3 : "+c+" "+d);
				System.out.printf("3 : %d %d\n",c,d);
			}//end C
			d=80;
			//d�� �� �� �ִ�
			System.out.println("4 : " + d);
			System.out.printf("4 : %d\n", d);
		}//end D
	}//main
}//class
