package javase.oo.abstractclass;
/*
 * - A:������ĳ�Ա�ص�
    - a:��Ա����:�ȿ����Ǳ�����Ҳ�����ǳ�����abstract�Ƿ�������γ�Ա�������������γ�Ա����
    - b:���췽�����С�

        - ����������ʸ������ݵĳ�ʼ����
    - c:��Ա�������ȿ����ǳ���ģ�Ҳ�����Ƿǳ����
- B:������ʾ

    - ������ĳ�Ա�ص�
- C:������ĳ�Ա�������ԣ�
    - a:���󷽷� ǿ��Ҫ�������������顣
    - b:�ǳ��󷽷� ����̳е����飬��ߴ��븴���ԡ�
 */
public class Demo2_Abstract {
	public static void main(String[] args) {
		
	}
}
abstract class Demo {
	int num = 10;
	final int num2 = 20;
	public Demo() {}
	public void print() {
		System.out.println("111");
	}
	public abstract void method();
}

class Test extends Demo {

	@Override
	public void method() {
		System.out.println("111");
	}
	
}