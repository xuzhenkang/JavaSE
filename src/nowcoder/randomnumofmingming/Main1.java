package nowcoder.randomnumofmingming;

import java.util.Scanner;
import java.util.TreeSet;
/**
 * ����Ĵ���
 * �ύʱ�䣺2016-01-19 ���ԣ�Java ����ʱ�䣺 <1 ms ռ���ڴ棺0K ״̬������ȷ
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