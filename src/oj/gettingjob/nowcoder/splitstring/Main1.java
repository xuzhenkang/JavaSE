package oj.gettingjob.nowcoder.splitstring;

import java.util.Scanner;


/**
 * ����Ĵ���
 * �ύʱ�䣺2016-01-20 ���ԣ�Java ����ʱ�䣺 <1 ms ռ���ڴ棺0K ״̬������ȷ
 * @author lenovo
 *
 */
public class Main1 {
 
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextLine()){
            String s=scanner.nextLine();
            split(s);
        }
        scanner.close();
    }
     
    public static void split(String s){
        while(s.length()>=8){
            System.out.println(s.substring(0, 8));
            s=s.substring(8);
        }
        if(s.length()<8&&s.length()>0){
            s=s+"00000000";
            System.out.println(s.substring(0, 8));
        }
    }
     
 
}