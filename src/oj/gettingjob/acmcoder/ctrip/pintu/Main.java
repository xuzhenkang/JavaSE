package oj.gettingjob.acmcoder.ctrip.pintu;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Main{

    /*������������������ʵ����ĿҪ��Ĺ���*/
    /*��Ȼ����Ҳ���Բ������������ģ����������ȫ�����Լ����뷨�� ^-^ */
    /******************************��ʼд����******************************/
    static int run(String numbers){
    	
		return 0;
    }
   /******************************����д����******************************/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        String numbers = new String();
        for(int rows=3; rows>0; rows--){
            for(String n: scan.nextLine().split(" ")){
                numbers += n;
            }
        }
 
        int res = run(numbers);
      
        System.out.println(String.valueOf(res));
    }
}

