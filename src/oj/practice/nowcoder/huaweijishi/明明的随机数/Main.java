package oj.practice.nowcoder.huaweijishi.明明的随机数;

import java.util.Scanner;
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
        int n = 0;
        while (cin.hasNext()) {
            tm.clear();
            n = cin.nextInt();
            for (int i = 0; i < n; i++) {
                int num = cin.nextInt();
                tm.put(num, num);
            }
             
            while (tm.size() > 0) {
                System.out.println(tm.get(tm.firstKey()));
                tm.remove(tm.firstKey());
            }
        }
        cin.close();
    }
}