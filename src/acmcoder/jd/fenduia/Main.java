package acmcoder.jd.fenduia;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	// ¹Ù·½µÄ´ð°¸
	public static void main(String[] args) {
		int n, k, ans;
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			n = cin.nextInt();
			k = cin.nextInt();
			ans = n / (2 * k + 1);
			ans *= 2;
			if(n % (2 * k + 1) >= k)
				ans++;
			System.out.printf("%d\n",ans);
		}
		cin.close();
	}

	private static void myCode() {
		Scanner cin = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int n = 0, k = 0, result = 0;
		while (cin.hasNext()) {
			n = cin.nextInt();
			k = cin.nextInt();
			result = 0;
			stack.clear();
			while (n != 0) {
				if (stack.isEmpty()) {
					n -= 1;
					stack.push(1);
				} else {
					if (stack.peek() == 1 && n == 1) {
						break;
					}
					if (stack.peek() == 1) {
						n -= 2;
						stack.push(2);
					} else if (stack.peek() == 2) {
						n -= 1;
						stack.push(1);
					}
				}
			}
			for (int i = 0; i < stack.size(); i++) {
				if (stack.get(i) >= k) result++;
			}
			System.out.println(result);
		}
		cin.close();
	}
}
