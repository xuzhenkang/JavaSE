package javase.base.structured_programming.selective_structure.test;
class Test1_Switch {
	public static void main(String[] args) {
		//* A:����(����һ��ֵ,�����Ӧ���ڼ�)
		int week = 1;
		switch (week) {
		case 1:
			System.out.println("����һ");
		break;
		case 2:
			System.out.println("���ڶ�");
		break;
		case 3:
			System.out.println("������");
		break;
		case 4:
			System.out.println("������");
		break;
		case 5:
			System.out.println("������");
		break;
		case 6:
			System.out.println("������");
		break;
		case 7:
			System.out.println("������");
		break;
		default:
			System.out.println("�Բ���û�ж�Ӧ������");
		break;
		}
	}
}
