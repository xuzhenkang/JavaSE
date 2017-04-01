package javase.oo.interfaces;

public class Demo1_Interface {
	public static void main(String[] args) {
		//Inter i = new Inter();�ӿڲ���ʵ����
		Inter i = new Demo();
		i.print();
	}
}
interface Inter {
	public abstract void print();		//�ӿ��еķ������ǳ����
}

class Demo implements Inter {

	@Override
	public void print() {
		System.out.println("print");
	}
}
/**
 * - A:�ӿڸ���

    - ������ĽǶȽ�����ָjava�е�interface

    - �ӹ���ĽǶȽ������ṩ����Ķ��ǽӿ�
- B:�ӿ��ص�
    - a:�ӿ��ùؼ���interface��ʾ
        - interface �ӿ��� {}
    - b:��ʵ�ֽӿ���implements��ʾ
        - class ���� implements �ӿ��� {}
    - c:�ӿڲ���ʵ����

        - ��ô���ӿ����ʵ�����أ�

        - ���ն�̬�ķ�ʽ��ʵ������
    - d:�ӿڵ�����
        - a:�����ǳ����ࡣ�������岻��
        - b:�����Ǿ����ࡣҪ��д�ӿ��е����г��󷽷���(�Ƽ�����)
- C:������ʾ

    - �ӿ��ص�
 */
