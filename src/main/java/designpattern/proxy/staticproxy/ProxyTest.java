package designpattern.proxy.staticproxy;

import org.junit.Test;

public class ProxyTest {
	@Test
	public void testProxy() {
		Sourceable sc = new MyProxy();
		sc.method();
	}
}
/*
 * 要实现代理方式要满足以下两个条件：
 * 1.必须要定义接口；
 * 2.每个业务类，需要一个代理类。
 * 
 * 静态代理模式的应用场景： 如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法：
 * 1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。
 * 2、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。 
 * 使用代理模式，可以将功能划分的更加清晰，有助于后期维护！
 */