package javase.oo.inherit;

class Demo8_˫�� {
	public static void main(String[] args) {
		DayOne d = new DayOne();
		d.���();
		d.print();
	}
}
/*
	* a:������˽�з������ܱ���д
		* ��Ϊ����˽�з�������������޷��̳�
	* b:������д���෽��ʱ������Ȩ�޲��ܸ���
		* ��þ�һ��
	* c:���ྲ̬����������Ҳ����ͨ����̬����������д
		* ��ʵ����㲻�Ϸ�����д����������ȷʵ��ˣ�����Ϊʲô�㲻�Ϸ�����д����̬���һὲ��(��ֻ̬�ܸ��Ǿ�̬)
		
	* ������д���෽����ʱ���������һģһ����
*/
class ˫�� {
	public void sing() {
		System.out.println("�����");
	}

	public void ���() {
		System.out.println("�����㶨��Ϧ����Ůʿ");
	}

	public static void print() {
		System.out.println("Fu print");
	}
}

class DayOne extends ˫�� {
	public void ���() {
		System.out.println("����Ӳ�Ϲ�");
	}

	public static void print() {				//��ֻ̬�ܸ��Ǿ�̬,��ʵ������д,��̬ʱ����ϸ����
		System.out.println("Zi print");
	}
}