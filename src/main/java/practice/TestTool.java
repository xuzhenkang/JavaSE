package practice;

public class TestTool {
	public static boolean isIPAddr(String str) {
		if (str != null && !str.isEmpty()) {
			// 定义正则表达式
			String regex = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\."
					+ "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
					+ "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
					+ "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
			if (str.matches(regex))
				return true;
			else
				return false;
		}
		return false;
	}

	public static void main(String[] args) {
		String text = "1.1.1.1";
		if (isIPAddr(text))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
