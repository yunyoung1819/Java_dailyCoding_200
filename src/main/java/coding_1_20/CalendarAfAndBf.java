package coding_1_20;

import java.util.Calendar;
import java.util.Date;

/**
 * Created on 2017.11.30 <br>
 * calendar Ŭ������ �̿��� ��¥ ���ϱ� <br>
 * java.util.Date�� �̿��� �Ϸ� ���� �Ϸ� �ڸ� ���� <br>
 * @author �ʺ��ڸ� ���� Java 200�� å ����_������ȭ��
 *
 */
public class CalendarAfAndBf {
	/**
	 * @param d �Է� ���� ���� ����ϱ� ���� �Է� ��
	 * @return �Ϸ� �ڸ� ���
	 */
	public Date afterOneDay(Date d){
		// d���� ��¥�� �Է��Ѵ�.
		long dd = d.getTime();
		// �и������� * 60�� * 60�� * 24�ð� == �Ϸ�
		return new Date(dd + 1000*60*60*24);
	}
	
	/**
	 * 
	 * @param d �Է� �� ���� ����ϱ� ���� �Է� ��
	 * @return �Ϸ� ���� ���
	 */
	public Date beforeOneDay(Date d){
		// d���� ��¥�� �Է��Ѵ�.
		long dd = d.getTime();
		// �и������� * 60�� * 60�� * 24�ð� == �Ϸ�
		return new Date(dd - 1000*60*60*24);
	}
	/*
	public Date setDate(int year, int month, int day){
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day); // 0~11���� �����ϱ� ������ -1
		return new Date(cal.getTimeInMillis());
	}
	*/
}
