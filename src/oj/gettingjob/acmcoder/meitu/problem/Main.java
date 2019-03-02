package oj.gettingjob.acmcoder.meitu.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 未通过
 * @author window
 */
public class Main {
  public static void main(String[] args) {  
    Main arrange = new Main();  
    List<Character> data = new ArrayList<Character>();  
    data.add('A');  
    data.add('B');  
    data.add('C');  
    data.add('D');  
    data.add('E');  
    data.add('F');  
    data.add('G');  
    data.add('H');  
      
    //输出A(n,n)的全排列  
    for(int i = 1; i <= data.size(); i++)  
        arrange.arrangeSelect(data,new ArrayList<Character>(),i);  

    Scanner cin = new Scanner(System.in);
    while (cin.hasNext()) {
      String[] lines = cin.nextLine().split(" ");
      for (int i = 0; i < Integer.parseInt(lines[0]); i++) {
        String lineddd = cin.nextLine();
      }
    }
    
}  
  
/** 
 * 计算A(n,k) 
 *  
 * @param data 
 * @param target 
 * @param k 
 */  
public <E> void arrangeSelect(List<E> data,List<E> target, int k) {  
    List<E> copyData;  
    List<E> copyTarget;  
    if(target.size() == k) {  
        for(E i : target)   
            System.out.print(i);  
        System.out.println();  
    }  
  
    for(int i=0; i<data.size(); i++) {  
        copyData = new ArrayList<E>(data);  
        copyTarget = new ArrayList<E>(target);  
          
        copyTarget.add(copyData.get(i));  
        copyData.remove(i);  
          
        arrangeSelect(copyData, copyTarget,k);  
    }  
} 
}
