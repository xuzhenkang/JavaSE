package nowcoder.ofo.problem1;

//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner cin = new Scanner(System.in);
//		while (cin.hasNext()) {
//			StringBuilder sb = new StringBuilder(cin.nextLine().trim());
//			String result = "";
//			if (sb.charAt(0) == '-') {
//				sb.delete(0, 1);
//				if (Long.parseLong(sb.toString()) <= Integer.MAX_VALUE || sb.equals("2147483648"))
//					result = "-" + sb.reverse();
//				else result = "0";
//			}
//			else {
//				
//				if (Long.parseLong(sb.toString()) <= Integer.MAX_VALUE)
//					result = sb.reverse().toString();
//				else result = "0";
//			}
//			System.out.println(result);
//		}
//		cin.close();
//	}
//}
import java.util.Scanner;

public class Main {
	static int reverse(String s) {
		String str = "";
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i > 0; i--) {
			sb.append(s.charAt(i));
		}
		if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
			sb.append(s.charAt(0));
			str = sb.toString();
		} else {
			str = "-" + sb.toString();
		}
		try {
			return Integer.valueOf(str);
		} catch (Exception e) {
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String string = cin.nextLine().trim();
		System.out.println(reverse(string));
		cin.close();
	}
}