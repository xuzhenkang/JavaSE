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
 * ����aop��һ��ԭ��
 * ��̬����ģʽ��һ������
 */