package javase.generic;
// ����Ƕ��
public class Demo07_StudentApp<T> {
	public static void main(String[] args) {
		Student<String> stu = new Student<String>();
		stu.setScore("����");
		System.out.println(stu.getScore());
		ClazzName<Student<String>> clz = new ClazzName<Student<String>>();
		clz.setStu(stu);
		Student<String> stu2 = clz.getStu();
		String score = stu2.getScore();
	}
}
