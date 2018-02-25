package oj.gettingjob.acmcoder.toutiao.形式化算式;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String express = cin.nextLine();
			String[] lines = express.split(" ");
			int num1 = Integer.parseInt(lines[0]);
			int num2 = Integer.parseInt(lines[2]);
			if (lines[1].equals("+")) {
				express = express + " = " + (num1 + num2);
			} else if (lines[1].equals("-")) {
				express = express + " = " + (num1 - num2);
			} else if (lines[1].equals("*")) {
				express = express + " = " + (num1 * num2);
			} else if (lines[1].equals("/")) {
				express = express + " = " + ((double) num1 / num2);
			}
			display(express);
		}
		cin.close();
	}

	static String[][] num = {
			{"***", "*", "***", "***", "* *", "***", "***", "***", "***", "***"}, 
			{"* *", "*", "  *", "  *", "* *", "*  ", "*  ", "  *", "* *", "* *"}, 
			{"* *", "*", "***", "***", "***", "***", "***", "  *", "***", "***"}, 
			{"* *", "*", "*  ", "  *", "  *", "  *", "* *", "  *", "* *", "  *"}, 
			{"***", "*", "***", "***", "  *", "***", "***", "  *", "***", "***"}};
	static String[][] opt = {
			{"   ", "   ", "   ", "   ", "   ", "   "}, 
			{" * ", "   ", "* *", "  *", "***", "   "}, 
			{"***", "***", " * ", " * ", "   ", "   "}, 
			{" * ", "   ", "* *", "*  ", "***", " **"}, 
			{"   ", "   ", "   ", "   ", "   ", " **"}};

	public static void display(String express) {
		for (int i = 0; i < 5; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < express.length(); j++) {
				if (express.charAt(j) >= '0' && express.charAt(j) <= '9') {
					sb.append(num[i][express.charAt(j) - '0'] + "  ");
				} else if (express.charAt(j) == '+'){
					sb.append(opt[i][0] + "  ");
				} else if (express.charAt(j) == '-'){
					sb.append(opt[i][1] + "  ");
				} else if (express.charAt(j) == '*'){
					sb.append(opt[i][2] + "  ");
				} else if (express.charAt(j) == '/'){
					sb.append(opt[i][3] + "  ");
				} else if (express.charAt(j) == '='){
					sb.append(opt[i][4] + "  ");
				} else if (express.charAt(j) == '.'){
					sb.append(opt[i][5] + "  ");
				}
			}
			System.out.println(sb.substring(0, sb.length()-2));
		}
	}
}
