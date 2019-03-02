package oj.gettingjob.acmcoder.toutiao.最大点集;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			TreeMap<Integer, Point> treeMap = new TreeMap<>();
			TreeMap<Integer, Integer> resultMap = new TreeMap<>();
			for (int i = 0; i < n; i++) {
				int x = cin.nextInt();
				int y = cin.nextInt();
				treeMap.put(x * x + y * y, new Point(x, y));
			}

			Point maxPoint = treeMap.get(treeMap.lastKey());
			treeMap.remove(treeMap.lastKey());
			resultMap.put(maxPoint.x, maxPoint.y);

			while (!treeMap.isEmpty()) {
				Point tempPoint = treeMap.get(treeMap.lastKey());
				boolean flag = false;
				for (Entry<Integer, Integer> entry : resultMap.entrySet()) {
					if (entry.getKey() >= tempPoint.x && entry.getValue() >= tempPoint.y) {
						flag = true;
						break;
					}
				}
				if (flag) break;
				else {
					maxPoint = tempPoint;
					treeMap.remove(treeMap.lastKey());
					resultMap.put(maxPoint.x, maxPoint.y);
				}
			}
			resultMap.forEach((x, y) -> System.out.println(x + " " + y));
		}
		cin.close();
	}
}

class Point {
	public int x;
	public int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

/*
(1,2)
(5,3)
(4,6)
(7,5)
(9,0)
 */

/*
5
1 2
9 0
4 6
5 3
7 5
----
4 6
7 5
9 0
*/
/**


 */

/**

(y)^
   |
 7 |*
   | 
 6 |*··············@ (4,6)
   |               :
 5 |*··············:···········@ (7,5)
   |               :           :
 4 |*              :           :
   |               :           :
 3 |*··············:···@ (5,3) :
   |               :   :       :
 2 |*··@ (1,2)     :   :       :
   |   :           :   :       :
 1 |*  :           :   :       :
   |   :           :   :       :     (9,0)
   +---*---*---*---*---*---*---*---*---@---*---->
  0    1   2   3   4   5   6   7   8   9   10  (x)
 */


