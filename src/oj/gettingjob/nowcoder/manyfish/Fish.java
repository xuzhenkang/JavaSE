package oj.gettingjob.nowcoder.manyfish;

import java.util.Scanner;
/**
<h2>��Ŀ����:</h2>
<div>
<p><span>ţţ��һ����ס���������Ѿ���n���㣬ÿ����Ĵ�СΪfishSize[i] (1 �� i �� n,��Ϊ������)��ţţ��������²�׽���������ס�����ڴ����Ŵ����С��Ķ��ɡ�</span></p>
<p><span>�����۲죬ţţ����һ����A�Ĵ�СΪ����һ����B��С��2����10��(����2����С��10����С)����A��Ե���B��</span></p>
<p><span>���ǵ������ţţҪ����������Ҫ��֤��</span></p>
<li>1���Ž�ȥ�����ǰ�ȫ�ģ����ᱻ������Ե�</li>
<li>2��������Ž�ȥҲ���ܳԵ�������</li>
<p><span>��������Ѿ����ڵ����Ѿ��ദ�˺ܾã����������ǻ��ಶʳ��</span></p>
<p><span>����֪���·�����Ĵ�С��Χ[minSize,maxSize](������Ĵ�С����������ʾ),ţţ��֪���ж����ִ�С������Է��������ס� </span></p>
<br/>
<h5><b>��������:</b></h5>
<pre><p><span>�������ݰ���3��.<br/>��һ��Ϊ�·�����ĳߴ緶ΧminSize,maxSize(1 �� minSize,maxSize �� 1000)���Կո�ָ���</span></p>
<p><span>�ڶ���Ϊ��������Ѿ����������n(1 �� n �� 50)</span></p>
<p><span>������Ϊ�Ѿ��е���Ĵ�СfishSize[i](1 �� fishSize[i] �� 1000)���Կո�ָ���</span></p>
</pre>
<br/>
<h5><b>�������:</b></h5>
<pre><p><span>����ж����ִ�С������Է��������ס�������Ĵ�С����������ʾ</span></p></pre>
<br/>
<h5><b>��������:</b></h5>
<pre>1 12<br/>
1<br/>
1<br/></pre>
<br/>
<h5><b>�������:</b></h5>
<pre>3</pre>
</div>
 * @author kang
 */
// ���ˣ�
public class Fish {

	static String[] firstLine, thirdLine;
	static int minSize, maxSize, n, result;// n�Ѿ��е��������;�·�����ĳߴ緶ΧminSize,maxSize(1 �� minSize,maxSize �� 1000)
	static int[] fishSize;
	static boolean ok;

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			result = 0;
			ok = true;
			firstLine = cin.nextLine().split(" ");
			minSize = Integer.parseInt(firstLine[0]);
			maxSize = Integer.parseInt(firstLine[1]);
			if (minSize < 1 || minSize > 1000 || maxSize < 1 || maxSize > 1000 || minSize > maxSize) {cin.close(); return;}
			n = Integer.parseInt(cin.nextLine());
			if (n < 1 || n > 50) { cin.close(); return;}
			thirdLine = cin.nextLine().split(" ");
			fishSize = new int[n];
			for (int i = 0; i < fishSize.length; i++) {
				fishSize[i] = Integer.parseInt(thirdLine[i]);
			}
			for (int size = minSize; size <= maxSize; size++) {// sizeΪ�·�����Ĵ�С
				for (int j = 0; j < fishSize.length; j++) {
					if (!(size >= 2 * fishSize[j] && size <= 10 * fishSize[j])
							&& !(fishSize[j] >= 2 * size && fishSize[j] <= 10 * size)) { // ���㲻�ᱻ�Ե�,����Ҳ����Ե������
						ok = true;
					} else {
						ok = false;
						break;
					}
				}
				if (ok) {
					result++;
				}
			}
			System.out.println(result);
		}
		cin.close();
	}
}
