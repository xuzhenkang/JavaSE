package javase.oo.interfaces;

public class Demo2_Interface {
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.print();
		System.out.println(Inter1.num);
	}
}
interface Inter1 {
	// �ӿ��еĳ�Ա����Ĭ�ϻ����������ؼ��� public static final,�����������ؼ���������ģ�˭��˭ǰ�涼��
	public static final int num = 10; // �ӿ���Ĭ�ϵĳ�Ա�������ǳ���
	//public Inter1(); �ӿ����޹�����
	// �ӿ��еķ���Ĭ����������public abstract,Ҳ�������
	public abstract void print();
}
class Demo1 implements Inter1 {
	public void print() {
		//num = 20;
		System.out.println(num);
	}
}

/**
- A:�ӿڳ�Ա�ص�

    - ��Ա������ֻ���ǳ����������Ǿ�̬�Ĳ������ġ�

        - Ĭ�����η���public static final

        - ���飺�Լ����ָ�����

    - ���췽�����ӿ�û�й��췽����
- B:������ʾ

    - �ӿڳ�Ա�ص�
 */
