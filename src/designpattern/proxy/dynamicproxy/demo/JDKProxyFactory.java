package designpattern.proxy.dynamicproxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyFactory implements InvocationHandler {
	private Object targetObject;

	public Object createProxyInstance(Object targetObject) {
		this.targetObject = targetObject;

		// newProxyInstance�����Ĳ������ͣ�
		// ��һ��������Ҫ�����Ŀ��������װ����
		// �ڶ���������Ŀ�������ʵ�ֵ����нӿ�
		// ������������һ���ص��Ľӿڣ�һ����������������󣬾ͻ�ص�����ӿڵ��е�invoke������
		// ������JDKProxyFactoryʵ��InvocationHandler�ӿڣ�Ȼ����������invoke������
		// ÿһ�����������������ʱ�򣬾ͻ�������invoke������
		return Proxy.newProxyInstance(this.targetObject.getClass().getClassLoader(),
				this.targetObject.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		PersonServiceBean pb = (PersonServiceBean) this.targetObject;
		if (pb.getUser() != null)
			return method.invoke(targetObject, args);
		else return null;
	}
}
