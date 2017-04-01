package javase.oo.constructor;

class Demo5_Phone {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.setBrand("ƻ��");
		p1.setPrice(1500);
		System.out.println(p1.getBrand() + "..." + p1.getPrice());

		Phone p2 = new Phone("С��",98);
		p2.show();
	}
}
/*
�ֻ���:
	��Ա����:
		Ʒ��brand,�۸�price
	���췽��
		�޲�,�в�
	��Ա����
		setXxx��getXxx
		show
*/
class Phone {
	private String brand;						//Ʒ��
	private int price;							//�۸�

	public Phone(){}							//�ղι���

	public Phone(String brand,int price) {		//�вι���
		this.brand = brand;
		this.price = price;
	}

	public void setBrand(String brand) {		//����Ʒ��
		this.brand = brand;
	}

	public String getBrand() {					//��ȡƷ��
		return brand;
	}

	public void setPrice(int price) {			//���ü۸�
		this.price = price;
	}

	public int getPrice() {						//��ȡ�۸�
		return price;
	}

	public void show() {
		System.out.println(brand + "..." + price);
	}
}