package designpattern.proxy.dynamicproxy.cglib;

import org.junit.Test;

public class TestCGLibProxy {
	@Test
	public void proxyTest() {
		CGLibProxyFactory factory = new CGLibProxyFactory();
		
		// ��ʱ�����Ĵ��������PersonServiceBean�������
		PersonServiceBean service = (PersonServiceBean) factory.createProxyInstance(new PersonServiceBean("xxx"));
		service.save("999");
	}
}
