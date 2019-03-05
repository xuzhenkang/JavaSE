package oj.gettingjob.nowcoder.systemconvertion;

import java.util.Scanner;

/**
<h2 class="subject-item-title">题目描述</h2>
<div class="subject-describe">
<p>  写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（<span style="color: rgb(51,51,51);">多组同时输入</span>
  <span>）</span>
</p>
<br/>
<h5><b>输入描述:</b></h5>
<pre><p>输入一个十六进制的数值字符串。</p></pre>
<br/>
<br/>
<h5><b>输出描述:</b></h5>
<pre><p>输出该数值的十进制字符串。</p></pre>
<br/>
<h5><b>输入例子:</b></h5>
<pre>0xA</pre>
<br/>
<h5><b>输出例子:</b></h5>
<pre>10</pre>
</div>
 * @author kang
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int result = 0;
		while (cin.hasNext()) {
			String sNum = cin.next().substring(1);
			result = 0;
			for (int i = sNum.length()-1; i > 0; i--) {
				if (sNum.charAt(i) == 'A') {
					result += 10 * (Math.pow(16, sNum.length()-i-1));
				} else if (sNum.charAt(i) == 'B') {
					result += 11 * (Math.pow(16, sNum.length()-i-1));
				} else if (sNum.charAt(i) == 'C') {
					result += 12 * (Math.pow(16, sNum.length()-i-1));
				} else if (sNum.charAt(i) == 'D') {
					result += 13 * (Math.pow(16, sNum.length()-i-1));
				} else if (sNum.charAt(i) == 'E') {
					result += 14 * (Math.pow(16, sNum.length()-i-1));
				} else if (sNum.charAt(i) == 'F') {
					result += 15 * (Math.pow(16, sNum.length()-i-1));
				} else {
					result += Integer.parseInt(sNum.charAt(i) + "") * (Math.pow(16, sNum.length()-i-1));
				}
			}
			System.out.println(result);
		}
		cin.close();
	}
}
