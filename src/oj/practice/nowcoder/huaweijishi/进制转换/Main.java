package oj.practice.nowcoder.huaweijishi.进制转换;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int result = 0;
        while (cin.hasNext()) {
            String sNum = cin.next().substring(1);
            result = 0;
            for (int i = sNum.length()-1; i > 0; i--) {
                if (sNum.charAt(i) == 'A') {
                    result += 10 * (Math.pow(16, sNum.length()-i-1));
                } else if (sNum.charAt(i) == 'B') {
                    result += 11 * (Math.pow(16, sNum.length()-i-1));
                } else if (sNum.charAt(i) == 'C') {
                    result += 12 * (Math.pow(16, sNum.length()-i-1));
                } else if (sNum.charAt(i) == 'D') {
                    result += 13 * (Math.pow(16, sNum.length()-i-1));
                } else if (sNum.charAt(i) == 'E') {
                    result += 14 * (Math.pow(16, sNum.length()-i-1));
                } else if (sNum.charAt(i) == 'F') {
                    result += 15 * (Math.pow(16, sNum.length()-i-1));
                } else {
                    result += Integer.parseInt(sNum.charAt(i) + "") * (Math.pow(16, sNum.length()-i-1));
                }
            }
            System.out.println(result);
        }
        cin.close();
    }
}


/*
 * 
 * C++的方法
#include <iostream>
using namespace std;
 
int main()
{
    int a;
    while(cin>>hex>>a){
    	cout<<a<<endl;
    }
}
 
*/
