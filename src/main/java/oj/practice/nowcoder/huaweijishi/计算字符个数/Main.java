package oj.practice.nowcoder.huaweijishi.计算字符个数;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = 0;
        while (cin.hasNext()) {
            n = 0;
            String firstLine = cin.nextLine();
            String secondLine = cin.nextLine();
            if (secondLine.length() != 1) {
                return;
            } else {
                for (int i = 0; i < firstLine.length(); i++) {
                    if ((firstLine.charAt(i)+"").equalsIgnoreCase("" + secondLine.charAt(0)))
                        n++;
                }
            }
            System.out.println(n);
        }
        cin.close();
    }
}