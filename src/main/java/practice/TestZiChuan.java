package practice;

public class TestZiChuan {

	public static String maxNoRepeatSubString(String str) {
		int[] table = new int[10];
		for (int i = 0; i < table.length; i++)
			table[i] = -1;
		int maxLen = 0, answerStart = 0, candidateStart = 0;
		for (int i = 0; i < str.length(); ++i) {
			if (table[str.charAt(i) - '0'] > candidateStart)
				candidateStart = table[str.charAt(i) - '0'];
			table[str.charAt(i) - '0'] = i + 1;
			if (maxLen < i - candidateStart + 1) {
				maxLen = i - candidateStart + 1;
				answerStart = candidateStart;
			}
		}
		return str.substring(answerStart, answerStart + maxLen);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		String str = "123456123";
		System.out.println(maxNoRepeatSubString(str));
	}
}
