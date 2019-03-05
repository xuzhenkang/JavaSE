package oj.gettingjob.nowcoder.meituan.problem1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static int result(int data[]) {
		int n = 0;
		int seven = 0;
		int notseven = 0;
		ArrayList<Integer> arrs = new ArrayList<Integer>();
		ArrayList<Integer> arrns = new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			if(data[i]%7==0){
				arrs.add(data[i]);
				seven++;}
			else arrns.add(data[i]);
		}
		HashMap<Integer, Integer> h = new HashMap<>();
		for(int a :arrns){
			for(int b : arrns){
				if (a!=b){
					//System.out.println("a:b"+a+b);
					int p = Integer.parseInt(String.valueOf(b) + String.valueOf(a)) ;
					int q = Integer.parseInt(String.valueOf(a) + String.valueOf(b)) ;
					if(!h.containsKey(p)){
						h.put(p,0);
						if(p%7==0)notseven++;
					}
					if(!h.containsKey(q)){
						h.put(q,0);
						if(q%7==0)notseven++;
					}
				}
				
			}
			
		}
		n = seven*(seven-1)+notseven;
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
		int n = in.nextInt();
		int [] data = new int[n];
		for(int i = 0; i<n;i++)
			data[i] = in.nextInt();
		int r = result(data);
		System.out.println(r);
		}
		in.close();
	}
	 

}
//import java.util.Scanner;
//
//public class Main {
//	static boolean isSeven(long num) {
//		if (num < 10000) {
//			if (num % 7 == 0) return true;
//			else return false;
//		}
//		return isSeven(num/10 - 2 * (num % 10));
//	}
//	public static void main(String[] args) {
////		System.out.println(isSeven(1996127));
//		Scanner cin = new Scanner(System.in);
//		while (cin.hasNext()) {
//			int n = Integer.parseInt(cin.nextLine());
//			String[] nums = cin.nextLine().split(" ");
//			int result = 0;
//			for (int i = 0; i < n; i++) {
//				for (int j = 0; j < n; j++) {
//					if (i == j) continue;
//					if (isSeven(Long.parseLong(nums[j] + nums[i]))) result++;
//				}
//			}
//			System.out.println(result);
//		}
//		cin.close();
//	}
//}
