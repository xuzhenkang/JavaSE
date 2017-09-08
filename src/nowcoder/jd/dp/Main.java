package nowcoder.jd.dp;
import java.util.Scanner;
import java.util.Stack;

/*Í¨¹ýµÄ*/
public class Main {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (scanner.hasNext()) {
			String in = scanner.nextLine();
			int number = 1;
			Stack<Character> stk = new Stack<>();
			for (int i = 0; i < in.length(); i++) {
				char c = in.charAt(i);
				if (c == '(')
					stk.push(c);
				else {
					number *= stk.size();
					stk.pop();
				}
			}
			System.out.print(number);
		}
	}
	
	
	// ×´Ì¬×ª»»·½³Ì£º
	// d(1) = 1
	// d(i) = d(i-1)*i, À¨ºÅÇ¶Ì×
	// d(i) = d(i-1), À¨ºÅ²»Ç¶Ì×
	
	
	
//	public static int get(String str, int i, int j, int k) {
//		if (str.charAt(i) == '(') {
//			return get(str, i+1, j, k) * j;
//		} else if (str.charAt(i) == ')') {
//			
//		}
//	}
//	public static int getN(String str) {
//		int result = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == '(')
//				result++;
//		}
//		return result;
//	}
	/*
	public static void f(String str, int n, int[] d, int i) {
		
		if (str.charAt(i) == '(' && str.charAt(i+1) == ')') { // ²»Ç¶Ì×
			d[n] = d[n-1];
		} else {
			d[n] = n * d[n - 1];
		}
		
	}
	
	public static int getN(String str) {
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(')
				result++;
		}
		return result;
	}
	
	public static String getString(String src) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < src.length(); i++) {
			if (src.charAt(i) == '(' || src.charAt(i) == '(') {
				sb.append(src.charAt(i));
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String src = "()(A(B))";
		int n = getN(src);
		String str = getString(src);
		int [] d = new int[n];
		d[1] = 1;
		for (int i = 0; i < n; i++) {
//			f(str, i, d, )
		}
		
		
		
	}
	*/
}


/* Í¨¹ýµÄ
import java.util.*;
	// ×´Ì¬×ª»»·½³Ì£º
	// d(1) = 1
	// d(i) = d(i-1)*i, À¨ºÅÇ¶Ì×
	// d(i) = d(i-1), À¨ºÅ²»Ç¶Ì×
public class Main  {

    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in 

);
        while (cin.hasNext()) {
            String s = cin.next();
            Map<String, Integer> dp = new HashMap<>();
            System.out.println(search(dp, s));
        }
    }

    public static int search(Map<String, Integer> dp, String cur) {

        if (!isLegal(cur)) return 0;
        if ("()".equals(cur)) return 1;
        if (dp.containsKey(cur)) return dp.get(cur);
        int res = 0;
        for (int i = cur.length() - 1; i >= 0; i--) {
            if (cur.charAt(i) == '(') continue;
            if (cur.charAt(i) == ')') {
                for (int j = i - 1; j >= 0; j--) {
                    if (cur.charAt(j) == '(') {
                        String str = cur.substring(0, j) + cur.substring(j + 1, i) + cur.substring(i + 1, cur.length());
                        res += search(dp, str);
                    }
                }
            }
            break;
        }
        dp.put(cur, res);
        return res;
    }

    public static boolean isLegal(String s) {
        int count = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                count++;
            } else {
                count--;
                if (count < 0) return false;
            }
            i++;
        }
        return count == 0;
    }
}
*/
