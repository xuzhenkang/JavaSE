package oj.gettingjob.nowcoder.primefactors;

import java.util.Scanner;

/**
</div>
<h2 class="subject-item-title">题目描述</h2>
<div class="subject-describe">
<p>  功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ） </p>
<div>
  <span>最后一个数后面也要有空格</span>
</div>
<div>
  <span>
    <br>
  </span>
</div>
<p>  详细描述： </p>
<p>
  <br> 函数接口说明： </p>
<p>  public String getResult(long ulDataInput) </p>
<p>  输入参数： </p>
<p>  long ulDataInput：输入的正整数 </p>
<p>  返回值： </p>
<p>  String </p>
<p>
  <br>
</p>
<p>
  <br>
</p>
<br/>
<h5><b>输入描述:</b></h5>
<pre><p>输入一个long型整数</p></pre>
<br/>
<br/>
<h5><b>输出描述:</b></h5>
<pre><p>按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。</p></pre>
<br/>
<h5><b>输入例子:</b></h5>
<pre>180
</pre>
<br/>
<h5><b>输出例子:</b></h5>
<pre>2 2 3 3 5
</pre>
</div>
 * @author kang
 *运行时间：37ms 占用内存：251k
 */
public class Main {
	public static boolean divided(long num, long divider) {
		return num % divider == 0 ? true : false;
	}
	public static boolean judgePrime(long num) {
		if (num <= 1) return false;
		for (long i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) return false;
			else continue;
		}
		return true;
	}
	public static String getResult(long ulDataInput) {
		long temp = ulDataInput;
		StringBuilder result = new StringBuilder();
		if (ulDataInput < 2) return "" + ulDataInput;
		long i = 2;
		while (i <= ulDataInput) {
			if (!judgePrime(i)) {
				i++;
				continue;
			}
			if (divided(temp, i)) {
				result.append(i + " ");
				temp /= i;
			} else {
				i++;
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			System.out.println(getResult(Long.parseLong(cin.nextLine())));
		}
		cin.close();
	}
}
