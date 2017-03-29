package nowcoder.houzhui;

import java.util.Scanner;
import java.util.Stack;
/**
 * 华为笔试题
 * @author lenovo
 *
 */
public class Main {

	
	
	public static int calc(StringBuilder sb) {
		int l, r;
		char c = sb.charAt(sb.length()-1);
		if (c == 'A') {
			return 10;
		} else if (c == 'B') {
			return 11;
		} else if (c == 'C') {
			return 12;
		} else if (c == 'D') {
			return 13;
		} else if (c == 'E') {
			return 14;
		} else if (c == 'F') {
			return 15;
		} else if (c == '+') {
			r = calc(new StringBuilder(sb.substring(0, sb.length()-1)));
			l = calc(new StringBuilder(sb.substring(0, sb.length()-2)));
			System.out.println("\nr=" + r + ",l=" + l + ";表达式为：" + l + c + r + "=" + (r+l));
			return r+l;
		} else if (c == '-') {
			r = calc(new StringBuilder(sb.substring(0, sb.length()-1)));
			l = calc(new StringBuilder(sb.substring(0, sb.length()-2)));
			System.out.println("\nr=" + r + ",l=" + l + ";表达式为：" + l + c + r + "=" + (l-r));
			return l-r;
		}  else if (c == '*') {
			r = calc(new StringBuilder(sb.substring(0, sb.length()-1)));
			l = calc(new StringBuilder(sb.substring(0, sb.length()-2)));
			System.out.println("\nr=" + r + ",l=" + l + ";表达式为：" + l + c + r + "=" + (r*l));
			return r*l;
		} else {
			return Integer.parseInt(c+"");
		}
	}
	
	
	
	
	public static int postfixCalc(String input) {
		int result = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == 'A') {
				stack.push(10);
			} else if (c == 'B') {
				stack.push(11);
			} else if (c == 'C') {
				stack.push(12);
			} else if (c == 'D') {
				stack.push(13);
			} else if (c == 'E') {
				stack.push(14);
			} else if (c == 'F') {
				stack.push(15);
			} else if (c == '+') {
				int right = stack.pop();
				int left = stack.pop();
				stack.push(left + right);
			} else if (c == '-') {
				int right = stack.pop();
				int left = stack.pop();
				stack.push(left - right);
			} else if (c == '*') {
				int right = stack.pop();
				int left = stack.pop();
				stack.push(left * right);
			} else {
				stack.push(Integer.parseInt(c + ""));
			}
		}
		if (!stack.isEmpty()) 
			result = stack.pop();
		return result;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String input = cin.nextLine();
			System.out.println(calc(new StringBuilder(input)));
		}
		cin.close();
	}
}
