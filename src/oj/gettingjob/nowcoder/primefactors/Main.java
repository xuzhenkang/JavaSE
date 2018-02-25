package oj.gettingjob.nowcoder.primefactors;

import java.util.Scanner;

/**
</div>
<h2 class="subject-item-title">��Ŀ����</h2>
<div class="subject-describe">
<p>  ����:����һ�������������մ�С�����˳����������������������ӣ���180����������Ϊ2 2 3 3 5 �� </p>
<div>
  <span>���һ��������ҲҪ�пո�</span>
</div>
<div>
  <span>
    <br>
  </span>
</div>
<p>  ��ϸ������ </p>
<p>
  <br> �����ӿ�˵���� </p>
<p>  public String getResult(long ulDataInput) </p>
<p>  ��������� </p>
<p>  long ulDataInput������������� </p>
<p>  ����ֵ�� </p>
<p>  String </p>
<p>
  <br>
</p>
<p>
  <br>
</p>
<br/>
<h5><b>��������:</b></h5>
<pre><p>����һ��long������</p></pre>
<br/>
<br/>
<h5><b>�������:</b></h5>
<pre><p>���մ�С�����˳����������������������ӣ��Կո���������һ��������ҲҪ�пո�</p></pre>
<br/>
<h5><b>��������:</b></h5>
<pre>180
</pre>
<br/>
<h5><b>�������:</b></h5>
<pre>2 2 3 3 5
</pre>
</div>
 * @author kang
 *����ʱ�䣺37ms ռ���ڴ棺251k
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
