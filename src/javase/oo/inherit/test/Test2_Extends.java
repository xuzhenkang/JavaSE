package javase.oo.inherit.test;
class Test2_Extends {
	public static void main(String[] args) {
		Zi1 z = new Zi1();
	}
	/*
	1,jvm������main����,main��ջ
	2,����Zi z = new Zi();���Ƚ�Fu.class��Zi.class�ֱ���ؽ��ڴ�,�ٴ�������,��Fu.class���ؽ��ڴ�
	����ľ�̬����������Fu.classһ�����,��Zi.class���ؽ��ڴ�,����ľ�̬����������Zi.classһ�����
	��һ�����,��̬�����Fu,�ڶ��������̬�����Zi
	3,��Zi��Ĺ��췽��,��Ϊjava���Ƿֲ��ʼ����,�ȳ�ʼ������,�ٳ�ʼ������,�������ߵĸ��๹��,������ִ��
	���๹��ʱ,���ָ����й�������,���������������ڹ��췽��ִ�е�����
	�����������������Fu,���ĸ�������췽��Fu
	4,Fu���ʼ������,�����ʼ��,�����������ǹ�������Zi,���췽��Zi
	*/
}
class Fu1 {
	static {
		System.out.println("��̬�����Fu");
	}

	{
		System.out.println("��������Fu");
	}

	public Fu1() {
		System.out.println("���췽��Fu");
	}
}

class Zi1 extends Fu1 {
	static {
		System.out.println("��̬�����Zi");
	}

	{
		System.out.println("��������Zi");
	}

	public Zi1() {
		System.out.println("���췽��Zi");
	}
}

