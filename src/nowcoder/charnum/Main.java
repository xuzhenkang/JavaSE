package nowcoder.charnum;

import java.util.Scanner;

/**
<h2 class="subject-item-title">��Ŀ����</h2>
<div class="subject-describe">
<p>д��һ�����򣬽���һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд��</p>
<br/>
<h5><b>��������:</b></h5>
<pre><p>����һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���</p></pre>
<br/>
<br/>
<h5><b>�������:</b></h5>
<pre><p>��������ַ����к��и��ַ��ĸ�����</p></pre>
<br/>
<h5><b>��������:</b></h5>
<pre>ABCDEF
A</pre>
<br/>
<h5><b>�������:</b></h5>
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
