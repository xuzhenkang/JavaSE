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
		String birthday = "1992年5月13日";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月dd日");
		Date myBirthday = sdf.parse(birthday);
		Date today = new Date();
		long myBirthdayTime = myBirthday.getTime();
		long thisDayTime = today.getTime();
		System.out.println((thisDayTime - myBirthdayTime) / (1000*60*60*24) + "天");
	}

	@SuppressWarnings("unused")
	private static void method1() throws ParseException {
		// 生日字符串和今天字符串存在String类型变量中
		String birthday = "1992年5月13日";
		String today = "2017年3月18日";
		// 定义日期转化对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月dd日");
		// 将日期字符串转化为日期对象
		Date myBirthday = sdf.parse(birthday);
		Date thisDay = sdf.parse(today);
		// 通过日期对象获取时间毫秒值
		long myBirthdayTime = myBirthday.getTime();
		long thisDayTime = thisDay.getTime();
		// 将两个时间毫秒值相减再除以(1000*60*60*24)
		System.out.println((thisDayTime - myBirthdayTime) / (1000*60*60*24) + "天");
	}
	
}
