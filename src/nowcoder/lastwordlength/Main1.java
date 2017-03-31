package nowcoder.lastwordlength;

import java.util.Scanner;

/**
 * 大神的代码
 * 提交时间：2016-01-20 语言：Java 运行时间： <1 ms 占用内存：0K 状态：答案正确
 * @author lenovo
 *
 */
public class Main1 {
	   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s="";
        while(input.hasNextLine()){
            s=input.nextLine();
            System.out.println(s.length()-1-s.lastIndexOf(" "));
        } 
        input.close();
    }
}
