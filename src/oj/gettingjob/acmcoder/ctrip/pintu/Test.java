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
        ArrayList<String> lis = new ArrayList<String>();    // ��¼ȫ���������(����ظ���)  
        Queue<String> queue = new LinkedList<String>();     // ����(�����������п���)  
        int count = 0;
        int[] d = {-1,-3,1,3};  // ���巽��(��,��,��,��)  
        queue.offer(s); // ���  
        lis.add(s);     // �����¼  
        while(queue.size()>0){  
            String firstStr = queue.poll(); // ����  
            if(firstStr.equals("123456780")){
            	System.out.println(count);
            	
            	return 1;// <span style="white-space:pre">   </span>// �ҵ����,�˳�  
            }
            int k = firstStr.indexOf("0");  // �ҵ� "0"�ŵ�λ��  
            for(int i=0;i<4;i++){    // ��,��,��,�� �ĸ�����̽��  
                int j = k+d[i];  
                if(j>=0&&j<=8){   // ��ǰ����Խ��  
                    String t = swap(firstStr,k,j);  // ����Ԫ��  
                    if(!lis.contains(t)){   // lis ������ t  
                        queue.offer(t); // ���  
                        lis.add(t);     // ��Ӽ�¼  
                        count++;
                    }  
                }  
            }  
        }  
        return 0;  
    }  
    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in);  
        System.out.println("��������n");  
        int n = scan.nextInt();  
        scan.nextLine();  
        String[] s = new String[n];  
        for(int i=0;i<n;i++){  
            s[i] = scan.nextLine(); // ��ʼ����  
        }  
        for(int i=0;i<n;i++){  
            System.out.println(f(s[i]));    // �õ����  
        }  
    } 
}
