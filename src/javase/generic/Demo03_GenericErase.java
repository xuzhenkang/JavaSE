package javase.generic;
/**
 * 泛型的擦除：使用时（实现或继承）没有指定类型
 * 类似于Object，不等同于Object
 * @author lenovo
 *
 */
public class Demo03_GenericErase {
	public static void main(String[] args) {
		// 此处就是一个泛型擦除，没有指定泛型的具体类型
		MyStudent student = new MyStudent();
		student.setJavase(100); // int -> Integer -> Object
		Object javase = student.getJavase(); // 不安全了
		
		test(student);
		MyStudent<Object> studentObj = new MyStudent<>();
//		test(studentObj); 不等同于Object
	}
	public static void test(MyStudent<Integer> stu) {
	}
	
}
