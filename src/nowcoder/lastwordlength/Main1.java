package nowcoder.lastwordlength;

import java.util.Scanner;

/**
 * ����Ĵ���
 * �ύʱ�䣺2016-01-20 ���ԣ�Java ����ʱ�䣺 <1 ms ռ���ڴ棺0K ״̬������ȷ
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
