package classes.date;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HowLongHaveYouBeenThisWorld {
	public static void main(String[] args) throws ParseException {
//		method1();
		method2();
	}

	private static void method2() throws ParseException {
		String birthday = "1992��5��13��";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��M��dd��");
		Date myBirthday = sdf.parse(birthday);
		Date today = new Date();
		long myBirthdayTime = myBirthday.getTime();
		long thisDayTime = today.getTime();
		System.out.println((thisDayTime - myBirthdayTime) / (1000*60*60*24) + "��");
	}

	private static void method1() throws ParseException {
		// �����ַ����ͽ����ַ�������String���ͱ�����
		String birthday = "1992��5��13��";
		String today = "2017��3��18��";
		// ��������ת������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��M��dd��");
		// �������ַ���ת��Ϊ���ڶ���
		Date myBirthday = sdf.parse(birthday);
		Date thisDay = sdf.parse(today);
		// ͨ�����ڶ����ȡʱ�����ֵ
		long myBirthdayTime = myBirthday.getTime();
		long thisDayTime = thisDay.getTime();
		// ������ʱ�����ֵ����ٳ���(1000*60*60*24)
		System.out.println((thisDayTime - myBirthdayTime) / (1000*60*60*24) + "��");
	}
	
}
