package javase.important_object.scanner;

import java.util.Scanner;

/**
 * - A:�������õķ��� - public int nextInt():��ȡһ��int���͵�ֵ - public String
 * nextLine():��ȡһ��String���͵�ֵ - B:������ʾ - a:����ʾ��ȡ���intֵ�����Stringֵ����� -
 * b:����ʾ�Ȼ�ȡintֵ��Ȼ���ȡStringֵ���ֵ����� - c:����������
 * 
 * - ��һ�֣��Ȼ�ȡһ����ֵ���ٴ���һ���µļ���¼������ȡ�ַ�����
 * 
 * - �ڶ��֣������е����ݶ��Ȱ����ַ�����ȡ��Ȼ��Ҫʲô���Ͷ�Ӧ��ת��Ϊʲô��(���潲)
 * 
 * @author Dan
 *
 */
public class Demo2_Scanner {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("�������һ������");
		int i = sc.nextInt();
		System.out.println("������ڶ�������");
		int j = sc.nextInt();
		System.out.println("i=" + i + ", j = " + j);*/
/*		System.out.println("�������һ���ַ�����");
		String line1 = sc.nextLine();
		System.out.println("������ڶ����ַ�����");
		String line2 = sc.nextLine();
		System.out.println("line1=" + line1 + ", line2=" + line2);
		*/
		/**
		 * nextInt()�����Ǽ���¼�������ķ�����������¼��10��ʱ��
		 * ��ʵ������¼�����10��\r\n,nextInt()����ֻ��ȡ10�ͽ�����
		 * 
		 * nextLine()�����Ǽ���¼���ַ����ķ��������Խ����������ͣ�
		 * ������ƾʲô�ܻ�ȡһ���أ�
		 * ͨ��\r\n��ֻҪ����\r\n��֤��һ�н���
		 */
/*		System.out.println("�������һ��������");
		int i = sc.nextInt();
		System.out.println("������ڶ����ַ�����");
		String line2 = sc.nextLine();
		System.out.println("i=" + i + ", line2=" + line2);
		System.out.println(i);
		System.out.print("11111111");
		System.out.print(line2);
		System.out.println("222222222");*/
		
		// �������
		// 1.�������ζ��󣬵����˷ѿռ�
		// 2.����¼��Ķ����ַ���������nextLine()�������������ǻ�ѧϰ���ַ���ת���������ķ���
		int i = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		String line = sc2.nextLine();
		System.out.println(i);
		System.out.println(line);
	}
}
