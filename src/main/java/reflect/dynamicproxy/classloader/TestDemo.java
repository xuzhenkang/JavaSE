package reflect.dynamicproxy.classloader;

public class TestDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println("类加载器：" + d.getClass().getClassLoader().getClass().getName());
	}
}
/**

类加载器：sun.misc.Launcher$AppClassLoader
*/
/***
其实在java中有三种类类加载器。

1）Bootstrap ClassLoader 此加载器采用c++编写，一般开发中很少见。

2）Extension ClassLoader 用来进行扩展类的加载，一般对应的是jre\lib\ext目录中的类

3）AppClassLoader 加载classpath指定的类，是最常用的加载器。同时也是java中默认的加载器。

如果想要完成动态代理，首先需要定义一个InvocationHandler接口的子类，已完成代理的具体操作。
*/