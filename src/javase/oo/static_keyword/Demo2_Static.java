package javase.oo.static_keyword;

class Demo2_Static {
	public static void main(String[] args) {
		//Demo d = new Demo();
		//d.print1();

		Demo.print2();
	}
}

/*
* A:static��ע������
	* a:�ھ�̬��������û��this�ؼ��ֵ�
		* ��������?
			* ��̬��������ļ��ض����أ�this�����Ŷ���Ĵ��������ڡ�
			* ��̬�ȶ����ȴ��ڡ�
	* b:��̬����ֻ�ܷ��ʾ�̬�ĳ�Ա�����;�̬�ĳ�Ա����
		* ��̬������
			* ��Ա������ֻ�ܷ��ʾ�̬����
			* ��Ա������ֻ�ܷ��ʾ�̬��Ա����
		* �Ǿ�̬������
			* ��Ա�����������Ǿ�̬�ģ�Ҳ�����ǷǾ�̬��
			* ��Ա�����������Ǿ�̬�ĳ�Ա������Ҳ�����ǷǾ�̬�ĳ�Ա������
		* �򵥼ǣ�
			* ��ֻ̬�ܷ��ʾ�̬��
*/

class Demo {
	int num1 = 10;						//�Ǿ�̬�ĳ�Ա����
	static int num2 = 20;				//��̬�ĳ�Ա����

	/*public void print1() {				//�Ǿ�̬�ĳ�Ա����,�ȿ��Է��ʾ�̬�ĳ�ԱҲ���Է��ʷǾ�̬��
		System.out.println(num1);
		System.out.println(num2);
	}*/

	public static void print2() {		//��̬�ĳ�Ա����
		//System.out.println(this.num1);//��̬�ĳ�Ա�������ܷ��ʷǾ�̬��,����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� num1
		System.out.println(num2);
	}
}