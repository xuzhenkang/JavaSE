package nowcoder.splitstring;

import java.util.Scanner;

/**
<h2 class="subject-item-title">��Ŀ����</h2>
<div class="subject-describe">
<p><span style="white-space:normal">���������ַ������밴����Ϊ8���ÿ���ַ�����������µ��ַ������飻</span><br style="white-space:normal"/><span style="white-space:normal">���Ȳ���8���������ַ������ں��油����0�����ַ���������</span><br/></p>
<br/>
<h5><b>��������:</b></h5>
<pre><p><span style="white-space:normal">���������ַ���(����2��,ÿ���ַ�������С��100)</span><br/></p></pre>
<br/>
<br/>
<h5><b>�������:</b></h5>
<pre><p><span style="white-space:normal">���������Ϊ8�����ַ�������</span><br/></p></pre>
<br/>
<h5><b>��������:</b></h5>
<pre>abc
123456789</pre>
<br/>
<h5><b>�������:</b></h5>
<pre>abc00000
12345678
90000000</pre>
</div>
 * @author kang
 *
 */
public class Main {
	
	private static StringBuilder appendToString(StringBuilder sb, int yushu) {
		if (yushu > 0) {
			int t = 0;
			while (t < 8 - yushu) {
				sb.append("0");
				t++;
			}
		}
		return sb;
	}
	private static boolean print(String line, StringBuilder sb) {
		if (line.length() > 100) {
			return false;
		} 
		if (line.length() < 8) {
			while (sb.length() < 8) {
				sb.append("0");
			}
			System.out.println(sb.toString());
		} else {
			int yushu = sb.length() % 8;
			int time = (int) Math.ceil(sb.length() / 8.0);
			sb = appendToString(sb, yushu);
			int start = 0, end = 8, i = 0;
			while (i < time) {
				start = i * 8;
				end = start + 8;
				System.out.println(sb.substring(start, end));
				i++;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String firstLine = cin.nextLine();
			String secondLine = cin.nextLine();
			StringBuilder sb1 = new StringBuilder(firstLine);
			StringBuilder sb2 = new StringBuilder(secondLine);
			if (!print(firstLine, sb1)) continue;
			if (!print(secondLine, sb2)) continue;
		}
		cin.close();
	}
}
