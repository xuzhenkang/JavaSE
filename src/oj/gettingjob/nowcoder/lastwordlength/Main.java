package oj.gettingjob.nowcoder.lastwordlength;

import java.util.Scanner;

/**
<h2 class="subject-item-title">��Ŀ����</h2>
<div class="subject-describe">
<p><span>�����ַ������һ�����ʵĳ��ȣ������Կո������</span></p>
<br/>
<h5><b>��������:</b></h5>
<pre><p><span>һ���ַ������ǿգ�����С��5000��</span></p></pre>
<br/>
<h5><b>�������:</b></h5>
<pre><p><span>����N�����һ�����ʵĳ��ȡ�</span></p></pre>
<br/>
<h5><b>��������:</b></h5>
<pre>hello world</pre>
<br/>
<h5><b>�������:</b></h5>
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
