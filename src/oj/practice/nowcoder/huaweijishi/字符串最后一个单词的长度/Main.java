package oj.practice.nowcoder.huaweijishi.字符串最后一个单词的长度;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String[] words = cin.nextLine().split(" ");
            System.out.println(words[words.length-1].length());
        }
        cin.close();
    }
}