package oj.gettingjob.acmcoder.ctrip.pintu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test {
    public static String swap(String s,int k,int j){  
        char[] c = s.toCharArray();  
        char t = c[k];  
        c[k] = c[j];  
        c[j] = t;  
        return new String(c);  
    }  
    public static int f(String s){  
        ArrayList<String> lis = new ArrayList<String>();    // 记录全部交换结果(检查重复用)  
        Queue<String> queue = new LinkedList<String>();     // 队列(用来测试所有可能)  
        int count = 0;
        int[] d = {-1,-3,1,3};  // 定义方向(左,上,右,下)  
        queue.offer(s); // 入队  
        lis.add(s);     // 加入记录  
        while(queue.size()>0){  
            String firstStr = queue.poll(); // 出队  
            if(firstStr.equals("123456780")){
            	System.out.println(count);
            	
            	return 1;// <span style="white-space:pre">   </span>// 找到结果,退出  
            }
            int k = firstStr.indexOf("0");  // 找到 "0"号的位置  
            for(int i=0;i<4;i++){    // 左,上,右,下 四个方向都探测  
                int j = k+d[i];  
                if(j>=0&&j<=8){   // 当前方向不越界  
                    String t = swap(firstStr,k,j);  // 交换元素  
                    if(!lis.contains(t)){   // lis 不包含 t  
                        queue.offer(t); // 入队  
                        lis.add(t);     // 添加记录  
                        count++;
                    }  
                }  
            }  
        }  
        return 0;  
    }  
    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in);  
        System.out.println("输入整数n");  
        int n = scan.nextInt();  
        scan.nextLine();  
        String[] s = new String[n];  
        for(int i=0;i<n;i++){  
            s[i] = scan.nextLine(); // 初始数据  
        }  
        for(int i=0;i<n;i++){  
            System.out.println(f(s[i]));    // 得到结果  
        }  
    } 
}
