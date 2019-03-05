package designpattern.proxy.dynamicproxy.cglib;

import org.junit.Test;

public class TestCGLibProxy {
	@Test
	public void proxyTest() {
		CGLibProxyFactory factory = new CGLibProxyFactory();
		
		// 此时创建的代理对象是PersonServiceBean类的子类
		PersonServiceBean service = (PersonServiceBean) factory.createProxyInstance(new PersonServiceBean("xxx"));
		service.save("999");
	}
}
