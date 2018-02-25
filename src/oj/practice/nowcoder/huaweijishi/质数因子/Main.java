package oj.practice.nowcoder.huaweijishi.质数因子;

import java.util.Scanner;
public class Main {
    public static boolean divided(long num, long divider) {
        return num % divider == 0 ? true : false;
    }
    public static boolean judgePrime(long num) {
        if (num <= 1) return false;
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
            else continue;
        }
        return true;
    }
    public static String getResult(long ulDataInput) {
        long temp = ulDataInput;
        StringBuilder result = new StringBuilder();
        if (ulDataInput < 2) return "" + ulDataInput;
        long i = 2;
        while (i <= ulDataInput) {
            if (!judgePrime(i)) {
                i++;
                continue;
            }
            if (divided(temp, i)) {
                result.append(i + " ");
                temp /= i;
            } else {
                i++;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            System.out.println(getResult(Long.parseLong(cin.nextLine())));
        }
        cin.close();
    }
}