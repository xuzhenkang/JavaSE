package nowcoder.lowercase;

import java.util.Scanner;
/**
 * »ªÎª±ÊÊÔÌâ
 * @author lenovo
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		StringBuffer sb = null;
		while (cin.hasNext()) {
			String line = cin.nextLine();
			sb = new StringBuffer(line);
			line = line.replaceAll("([^a-zA-Z]*)*", "$1");
 			System.out.println(line.toLowerCase());
		}
		cin.close();
	}
}
