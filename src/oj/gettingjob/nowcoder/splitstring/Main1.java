package oj.gettingjob.nowcoder.splitstring;

import java.util.Scanner;


/**
 * 大神的代码
 * 提交时间：2016-01-20 语言：Java 运行时间： <1 ms 占用内存：0K 状态：答案正确
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