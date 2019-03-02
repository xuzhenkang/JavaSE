package oj.gettingjob.nowcoder.randomnumofmingming;

import java.util.Scanner;
import java.util.TreeSet;
/**
 * 大神的代码
 * 提交时间：2016-01-19 语言：Java 运行时间： <1 ms 占用内存：0K 状态：答案正确
 * @author lenovo
 *
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<Integer>();
            for(int i = 0 ; i < num ;i++){
                int curr = sc.nextInt();
                set.add(curr);
            }
            for(Integer i : set){
                System.out.println(i);
            }
        }
        sc.close();
    }
}