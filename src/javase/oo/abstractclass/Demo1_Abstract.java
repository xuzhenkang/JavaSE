package javase.oo.abstractclass;

public class Demo1_Abstract {
	public static void main(String[] args) {
		//Animal a = new Animal(); // ����Animal�ǳ���ģ��޷�ʵ����
		Animal a = new Cat();
		a.eat();
	}
}

abstract class Animal {						// ������
	public abstract void eat();				// ���󷽷�
}

class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("è����");
	}
}
/**
- A:���������

- ������ǿ�������
- B:�������ص�
- a:������ͳ��󷽷�������abstract�ؼ�������
    - abstract class ���� {}
    - public abstract void eat();
- b:�����಻һ���г��󷽷����г��󷽷�����һ���ǳ�������߽ӿ�
- c:�����಻��ʵ��������ô�����������ʵ�����أ�

    - ���ն�̬�ķ�ʽ���ɾ��������ʵ��������ʵ��Ҳ�Ƕ�̬��һ�֣��������̬��
- d:�����������

    - Ҫô�ǳ�����

    - Ҫô��д�������е����г��󷽷�
- C:������ʾ

- �������ص�
*/