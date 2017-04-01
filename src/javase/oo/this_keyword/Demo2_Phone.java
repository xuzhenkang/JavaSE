package javase.oo.this_keyword;

class Demo2_Phone {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.setBrand("����");
		p1.setPrice(5288);

		System.out.println(p1.getBrand() + "..." + p1.getPrice());
		p1.call();
		p1.sendMessage();
		p1.playGame();
	}
}
/*
�ֻ���
	����:Ʒ��brand,�۸�price
	��Ϊ:��绰call,������sendMessage,����Ϸ,playGame
*/
class Phone {								//java bean
	private String brand;					//Ʒ��
	private int price;						//�۸�

	public void setBrand(String brand) {	//����Ʒ��
		this.brand = brand;
	}

	public String getBrand() {				//��ȡƷ��
		return this.brand;					//this.����ʡ��,�㲻��ϵͳ��Ĭ�ϸ����
	}

	public void setPrice(int price) {		//���ü۸�
		this.price = price;
	}

	public int getPrice() {					//��ȡ�۸�
		return price;
	}

	public void call() {					//��绰
		System.out.println("��绰");
	}

	public void sendMessage() {				//������
		System.out.println("������");
	}

	public void playGame() {				//����Ϸ
		System.out.println("����Ϸ");
	}
}