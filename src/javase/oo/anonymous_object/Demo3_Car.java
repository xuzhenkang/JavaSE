package javase.oo.anonymous_object;

class Demo3_Car {
	public static void main(String[] args) {
		//Car c1 = new Car();
		/*c1.color = "red";
		c1.num = 8;
		c1.run();*/
		//method(c1);

		method(new Car());

		//Car c2 = new Car();
		//method(c2);
		method(new Car());				//����������Ե�����������
	}

	//��ȡ������ߴ���ĸ�����
	public static void method(Car cc) {	//Car cc = new Car();
		cc.color = "red";
		cc.num = 8;
		cc.run();
	}
}

class Car1 {
	String color;			//��ɫ
	int num;				//��̥��

	public void run() {
		System.out.println(color + "..." + num);
	}
}
