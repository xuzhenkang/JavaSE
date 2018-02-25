package oj.gettingjob.nowcoder.manyfish;

import java.util.Scanner;
/**
<h2>题目描述:</h2>
<div>
<p><span>牛牛有一个鱼缸。鱼缸里面已经有n条鱼，每条鱼的大小为fishSize[i] (1 ≤ i ≤ n,均为正整数)，牛牛现在想把新捕捉的鱼放入鱼缸。鱼缸内存在着大鱼吃小鱼的定律。</span></p>
<p><span>经过观察，牛牛发现一条鱼A的大小为另外一条鱼B大小的2倍到10倍(包括2倍大小和10倍大小)，鱼A会吃掉鱼B。</span></p>
<p><span>考虑到这个，牛牛要放入的鱼就需要保证：</span></p>
<li>1、放进去的鱼是安全的，不会被其他鱼吃掉</li>
<li>2、这条鱼放进去也不能吃掉其他鱼</li>
<p><span>鱼缸里面已经存在的鱼已经相处了很久，不考虑他们互相捕食。</span></p>
<p><span>现在知道新放入鱼的大小范围[minSize,maxSize](考虑鱼的大小都是整数表示),牛牛想知道有多少种大小的鱼可以放入这个鱼缸。 </span></p>
<br/>
<h5><b>输入描述:</b></h5>
<pre><p><span>输入数据包括3行.<br/>第一行为新放入鱼的尺寸范围minSize,maxSize(1 ≤ minSize,maxSize ≤ 1000)，以空格分隔。</span></p>
<p><span>第二行为鱼缸里面已经有鱼的数量n(1 ≤ n ≤ 50)</span></p>
<p><span>第三行为已经有的鱼的大小fishSize[i](1 ≤ fishSize[i] ≤ 1000)，以空格分隔。</span></p>
</pre>
<br/>
<h5><b>输出描述:</b></h5>
<pre><p><span>输出有多少种大小的鱼可以放入这个鱼缸。考虑鱼的大小都是整数表示</span></p></pre>
<br/>
<h5><b>输入例子:</b></h5>
<pre>1 12<br/>
1<br/>
1<br/></pre>
<br/>
<h5><b>输出例子:</b></h5>
<pre>3</pre>
</div>
 * @author kang
 */
// 过了！
public class Fish {

	static String[] firstLine, thirdLine;
	static int minSize, maxSize, n, result;// n已经有的鱼的数量;新放入鱼的尺寸范围minSize,maxSize(1 ≤ minSize,maxSize ≤ 1000)
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
			for (int size = minSize; size <= maxSize; size++) {// size为新放入鱼的大小
				for (int j = 0; j < fishSize.length; j++) {
					if (!(size >= 2 * fishSize[j] && size <= 10 * fishSize[j])
							&& !(fishSize[j] >= 2 * size && fishSize[j] <= 10 * size)) { // 新鱼不会被吃掉,并且也不会吃掉别的鱼
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
