package oj.gettingjob.nowcoder.randomnumofmingming;

import java.util.Scanner;
import java.util.TreeMap;

/**
<h2 class="subject-item-title">��Ŀ����</h2>
<div class="subject-describe">
<p>
  ��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ������ü����������N��1��1000֮������������N��1000�������������ظ������֣�ֻ����һ������������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�Ȼ���ٰ���Щ����С�������򣬰����źõ�˳��ȥ��ͬѧ�����顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ����� </p>
<p>    </p>
<p>    </p>
<p>  Input Param  </p>
<p>       n               ����������ĸ���      </p>
<p>   inputArray      n�����������ɵ�����  </p>
<p>        </p>
<p>  Return Value </p>
<p>       OutputArray    ���������������� </p>
<p>    </p>
<p>
  <br> ע������������֤�����������ȷ�ԣ�������������֤������������ֹһ�顣 </p>
<p>
  <br>   </p>
<p>    </p>
<br/>
<h5><b>��������:</b></h5>
<pre><p>������У���������������ĸ�������������Ӧ����������</p></pre>
<br/>
<br/>
<h5><b>�������:</b></h5>
<pre><p>���ض��У������Ľ��</p></pre>
<br/>
<h5><b>��������:</b></h5>
<pre>11
10
20
40
32
67
40
20
89
300
400
15
</pre>
<br/>
<h5><b>�������:</b></h5>
<pre>10
15
20
32
40
67
89
300
400
</pre>
</div>
 * @author lenovo
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		int n = 0;
		while (cin.hasNext()) {
			tm.clear();
			n = cin.nextInt();
			for (int i = 0; i < n; i++) {
				int num = cin.nextInt();
				tm.put(num, num);
			}
			while (tm.size() > 0) {
				System.out.println(tm.get(tm.firstKey()));
				tm.remove(tm.firstKey());
			}
		}
		cin.close();
	}
}
