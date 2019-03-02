package oj.gettingjob.alibaba.tianmao;
/**
 * 天猫国际每天都会卖出很多跨境商品，用户每次下单可能购买多个商品，购买总数小于10件，由于海关规定，每一个进入海关的箱子里面的商品总额不能超过2000元（否则不能清关）所以当用户下单总金额超过2000，必须使用多个箱子分开包装运输；现在为了节约运输成本，希望在满足海关的要求下，能够使用尽可能少的箱子。
注：
每个商品都有自己的单价，有特定的长宽高，所有商品都是长方体
商品可以横放、竖放、侧放，但不用考虑斜放，但是长宽高各项总和必须都要小于等于箱子的长宽高
假定目前天猫国际使用同一种规格的箱子
boxLong,boxWidth,boxHigh
（箱子长，箱子宽，箱子高）
 
某用户下单买了如下商品
n（商品件数）
item1Price,item1Long,item1With,item1High
item2Price,item2Long,item2With,item2High
item3Price,item3Long,item3With,item3High
item4Price,item4Long,item4With,item4High
...
（商品价格，商品长，商品宽，商品高）
 (所有输入类型均为int型正整数)
 
请你算出需要使用最小的箱子数量，可以将这些商品顺利得清关送到消费者手中，如果无解，输出-1

编程说明
编译器版本: Java 1.8.0_66
请使用标准输入输出(System.in, System.out)；已禁用图形、文件、网络、系统相关的操作，如java.lang.Process , javax.swing.JFrame , Runtime.getRuntime；不要自定义包名称，否则会报错，即不要添加package answer之类的语句；您可以写很多个类，但是必须有一个类名为Main，并且为public属性，并且Main为唯一的public class，Main类的里面必须包含一个名字为'main'的静态方法（函数），这个方法是程序的入口
时间限制: 3S (C/C++以外的语言为: 5 S)   内存限制: 64M (C/C++以外的语言为: 576 M)
输入:
输入箱子长宽高 输入购买商品数 输入每个商品长宽高
输出:
输出最小箱子数
输入范例:
10 20 30
3
1000 10 10 30
500 10 10 20
600 8 10 20
输出范例:
2

 * @author lenovo
 *
 */


import java.util.Scanner;
class BoxTemplate {
	public int price;
	public int length;
	public int width;
	public int height;
}
class Model {
	public int price;
	public int length;
	public int width;
	public int height;
}
public class Main {
/** 请完成下面这个process函数，实现题目要求的功能 **/
 /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
private static int process() 
{
return -1;
}
public static final int  CUSTOMS_LIMIT_MONEY_PER_BOX = Integer.MAX_VALUE;
public static BoxTemplate boxTemplate = new BoxTemplate();
public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        boxTemplate.price = CUSTOMS_LIMIT_MONEY_PER_BOX;

        while (scanner.hasNext()){
            boxTemplate.length = scanner.nextInt();
            boxTemplate.width = scanner.nextInt();
            boxTemplate.height = scanner.nextInt();

            int itemNum = scanner.nextInt();
            Model[] items = new Model[itemNum];
            for(int i=0; i<itemNum; i++){
                Model item = new Model();
                item.price = scanner.nextInt();
                item.length = scanner.nextInt();
                item.width = scanner.nextInt();
                item.height = scanner.nextInt();
                items[i] = item;
            }
            long startTime = System.currentTimeMillis();
            int boxMinNum = Integer.MAX_VALUE;
          System.out.println (process());
        }
        }
}
