package javase.oo.interfaces;

public class Demo3_Interface {
	public static void main(String[] args) {

	}
}
interface InterA {
	public abstract void printA();
}
interface InterB {
	public abstract void printB();
}
interface InterC extends InterA, InterB {
	
}
class Demo2 extends Object implements InterA, InterB {

	@Override
	public void printA() {
		System.out.println("printA");
	}

	@Override
	public void printB() {
		System.out.println("printB");
	}
}

/**
 * 
 * - A:�����࣬����ӿڣ��ӿ���ӿڵĹ�ϵ - a:������:
 * 
 * - �̳й�ϵ��ֻ�ܵ��̳У����Զ��̳С� - b:����ӿ�:
 * 
 * - ʵ�ֹ�ϵ�����Ե�ʵ�֣�Ҳ���Զ�ʵ�֡�
 * 
 * - ���һ������ڼ̳�һ�����ͬʱʵ�ֶ���ӿڡ� - c:�ӿ���ӿ�:
 * 
 * - �̳й�ϵ�����Ե��̳У�Ҳ���Զ�̳С� - B:������ʾ
 * 
 * - �����࣬����ӿڣ��ӿ���ӿڵĹ�ϵ
 */