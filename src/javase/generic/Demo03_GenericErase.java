package javase.generic;
/**
 * ���͵Ĳ�����ʹ��ʱ��ʵ�ֻ�̳У�û��ָ������
 * ������Object������ͬ��Object
 * @author lenovo
 *
 */
public class Demo03_GenericErase {
	public static void main(String[] args) {
		// �˴�����һ�����Ͳ�����û��ָ�����͵ľ�������
		MyStudent student = new MyStudent();
		student.setJavase(100); // int -> Integer -> Object
		Object javase = student.getJavase(); // ����ȫ��
		
		test(student);
		MyStudent<Object> studentObj = new MyStudent<>();
//		test(studentObj); ����ͬ��Object
	}
	public static void test(MyStudent<Integer> stu) {
	}
	
}
