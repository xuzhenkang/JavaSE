package javase.base.structured_programming.selective_structure.test;
import java.util.Scanner;
class Test3_SwitchIf {
	public static void main(String[] args) {
		/*

		* ����¼���·ݣ������Ӧ�ļ���
		һ�����ļ�
		3,4,5����
		6,7,8�ļ�
		9,10,11�＾
		12,1,2����
		*/
		Scanner sc = new Scanner(System.in);	//��������¼�����
		System.out.println("�������·�");
		int month = sc.nextInt();				//������¼��Ľ���洢��month
		/*switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month + "���Ǵ���");
		break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "�����ļ�");
		break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "�����＾");
		break;
		case 12:
		case 1:
		case 2:
			System.out.println(month + "���Ƕ���");
		break;
		default:
			System.out.println("�Բ���û�ж�Ӧ�ļ���");
		break;
		}*/

		//��if���������·ݶ�Ӧ����
		if (month > 12 || month < 1) {
			System.out.println("�Բ���û�ж�Ӧ�ļ���");
		}else if (month >= 3 && month <= 5) {
			System.out.println(month + "���Ǵ���");
		}else if (month >= 6 && month <= 8) {
			System.out.println(month + "�����ļ�");
		}else if (month >= 9 && month <= 11) {
			System.out.println(month + "�����＾");
		}else {
			System.out.println(month + "���Ƕ���");
		}
	}
}
