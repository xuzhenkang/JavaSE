package oj.gettingjob.alibaba.tianmao;
/**
 * ��è����ÿ�춼�������ܶ�羳��Ʒ���û�ÿ���µ����ܹ�������Ʒ����������С��10�������ں��ع涨��ÿһ�����뺣�ص������������Ʒ�ܶ�ܳ���2000Ԫ����������أ����Ե��û��µ��ܽ���2000������ʹ�ö�����ӷֿ���װ���䣻����Ϊ�˽�Լ����ɱ���ϣ�������㺣�ص�Ҫ���£��ܹ�ʹ�þ������ٵ����ӡ�
ע��
ÿ����Ʒ�����Լ��ĵ��ۣ����ض��ĳ���ߣ�������Ʒ���ǳ�����
��Ʒ���Ժ�š����š���ţ������ÿ���б�ţ����ǳ���߸����ܺͱ��붼ҪС�ڵ������ӵĳ����
�ٶ�Ŀǰ��è����ʹ��ͬһ�ֹ�������
boxLong,boxWidth,boxHigh
�����ӳ������ӿ����Ӹߣ�
 
ĳ�û��µ�����������Ʒ
n����Ʒ������
item1Price,item1Long,item1With,item1High
item2Price,item2Long,item2With,item2High
item3Price,item3Long,item3With,item3High
item4Price,item4Long,item4With,item4High
...
����Ʒ�۸���Ʒ������Ʒ����Ʒ�ߣ�
 (�����������;�Ϊint��������)
 
���������Ҫʹ����С���������������Խ���Щ��Ʒ˳��������͵����������У�����޽⣬���-1

���˵��
�������汾: Java 1.8.0_66
��ʹ�ñ�׼�������(System.in, System.out)���ѽ���ͼ�Ρ��ļ������硢ϵͳ��صĲ�������java.lang.Process , javax.swing.JFrame , Runtime.getRuntime����Ҫ�Զ�������ƣ�����ᱨ������Ҫ���package answer֮�����䣻������д�ܶ���࣬���Ǳ�����һ������ΪMain������Ϊpublic���ԣ�����MainΪΨһ��public class��Main�������������һ������Ϊ'main'�ľ�̬����������������������ǳ�������
ʱ������: 3S (C/C++���������Ϊ: 5 S)   �ڴ�����: 64M (C/C++���������Ϊ: 576 M)
����:
�������ӳ���� ���빺����Ʒ�� ����ÿ����Ʒ�����
���:
�����С������
���뷶��:
10 20 30
3
1000 10 10 30
500 10 10 20
600 8 10 20
�������:
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
/** ������������process������ʵ����ĿҪ��Ĺ��� **/
 /** ��Ȼ����Ҳ���Բ��������ģ����������ȫ�����Լ����뷨�� ^-^  **/
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
