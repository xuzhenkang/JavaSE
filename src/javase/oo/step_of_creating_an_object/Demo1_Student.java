package javase.oo.step_of_creating_an_object;

class Demo1_Student {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
	}
}

class Student {
	private String name = "张三";
	private int age = 23;

	public Student() {
		name = "李四";
		age = 24;
	}

	public void show() {
		System.out.println(name + "..." + age);
	}
}
/*
 *
 * 	* 1,Student.class加载进内存
	* 2,声明一个Student类型引用s
	* 3,在堆内存创建对象,
	* 4,给对象中属性默认初始化值
	* 5,属性进行显示初始化
	* 6,构造方法进栈,对对象中的属性赋值,构造方法弹栈
	* 7,将对象的地址值赋值给s
 */
