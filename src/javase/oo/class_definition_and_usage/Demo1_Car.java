package javase.oo.class_definition_and_usage;

class Demo1_Car {
	public static void main(String[] args) {
		Car c1 = new Car();				//��������

		//�������Բ���ֵ
		c1.color = "red";				//Ϊ������ɫ��ֵ
		c1.num = 8;						//Ϊ������̥����ֵ

		//������Ϊ
		c1.run();

		Car c2 = new Car();				//��������
		c2.color = "black";				//Ϊ������ɫ��ֵ
		c2.num = 4;						//Ϊ������̥����ֵ
		c2.run();

		//c2 = null;						//��null��ԭ���ĵ�ֵַ���ǵ���

		//c2.run();						//c2�����¼����null,���Ա�����ָ���쳣

		Car c3 = c2;
		c3.run();
		
	}
}
/*
��������
	������ɫ
	������̥��
������Ϊ
	������
*/

class Car {
	//��Ա����
	String color;						//������ɫ
	int num;							//������̥��

	public void run() {					//������
		System.out.println(color + "..." + num);
	}
}
