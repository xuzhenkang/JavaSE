package nowcoder.charnum;

import java.util.Scanner;

/**
<h2 class="subject-item-title">题目描述</h2>
<div class="subject-describe">
<p>写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。</p>
<br/>
<h5><b>输入描述:</b></h5>
<pre><p>输入一个有字母和数字以及空格组成的字符串，和一个字符。</p></pre>
<br/>
<br/>
<h5><b>输出描述:</b></h5>
<pre><p>输出输入字符串中含有该字符的个数。</p></pre>
<br/>
<h5><b>输入例子:</b></h5>
<pre>ABCDEF
A</pre>
<br/>
<h5><b>输出例子:</b></h5>
<pre>1</pre>
</div>
 * @author lenovo
 *
 */
public class Main {
	public static void main(String[] args) {
		int n = 0; 
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			n = 0;
			String firstLine = cin.nextLine();
			String secondLine = cin.nextLine();
			if (secondLine.length() != 1) {
				cin.close();
				return;
			} else {
				for (int i = 0; i < firstLine.length(); i++) {
					if ((firstLine.charAt(i)+"").equalsIgnoreCase("" + secondLine.charAt(0)))
						n++;
				}
			}
			System.out.println(n);
		}
		cin.close();
	}
}
