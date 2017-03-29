package reflect;
/**
所有类的对象其实都是Class的实例。
输出结果：
reflect.Demo
 */
public class TestDemo1 {
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.getClass().getName());
	}
}

