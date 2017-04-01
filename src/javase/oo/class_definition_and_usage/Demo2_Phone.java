package javase.oo.class_definition_and_usage;

class Demo2_Phone {
	public static void main(String[] args) {
		//��������
		Phone p = new Phone();
		//���ö����е����Բ���ֵ
		p.brand = "����";
		p.price = 998;

		System.out.println(p.brand + "..."  + p.price);

		//���ó�Ա����
		p.call();
		p.sendMessage();
		p.playGame();
	}
}

/*
* ģ��ѧ���࣬��ѧ���Լ����
	* ����:Ʒ��(brand)�۸�(price)
	* ��Ϊ:��绰(call),����Ϣ(sendMessage)����Ϸ(playGame)

*/
class Phone {
	String brand;					//Ʒ��
	int price;						//�۸�

	public void call() {			//��绰
		System.out.println("��绰");
	}

	public void sendMessage() {		//����Ϣ
		System.out.println("����Ϣ");
	}

	public void playGame() {		//����Ϸ
		System.out.println("����Ϸ");
	}
}