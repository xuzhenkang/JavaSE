package oj.gettingjob.nowcoder.lastwordlength;

import java.util.Scanner;

/**
<h2 class="subject-item-title">题目描述</h2>
<div class="subject-describe">
<p><span>计算字符串最后一个单词的长度，单词以空格隔开。</span></p>
<br/>
<h5><b>输入描述:</b></h5>
<pre><p><span>一行字符串，非空，长度小于5000。</span></p></pre>
<br/>
<h5><b>输出描述:</b></h5>
<pre><p><span>整数N，最后一个单词的长度。</span></p></pre>
<br/>
<h5><b>输入例子:</b></h5>
<pre>hello world</pre>
<br/>
<h5><b>输出例子:</b></h5>
<pre>5</pre>
</div>
 * @author Kang
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String[] words = cin.nextLine().split(" ");
			System.out.println(words[words.length-1].length());
		}
		cin.close();
	}
}
