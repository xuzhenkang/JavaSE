package designpattern.proxy.dynamicproxy.demo;

import org.junit.Test;

public class TestAop {
	
	@Test
	public void testProxy() {
		PersonService personService = (PersonService) new JDKProxyFactory().createProxyInstance(new PersonServiceBean());
		
		personService.save("ddd");
	}
}
/*
 * 这是aop的一个原理
 * 动态代理模式的一个例子
 */