package designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler {

	private Object target;

	public MyProxy(Object target) {
		this.target = target;
	}

	public Object newProxy() {
		return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(),
				this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		return method.invoke(target, args);
	}
}
/**
 * Proxy.newProxyInstance�Ĳ������ͣ�
 * 
 * һ��ClassLoader���󣬶��������ĸ�ClassLoader�����������ɵĴ��������м���
 * loader - the class loader to define the proxy class  
 * 
 * һ��Interface��������飬��ʾ�����ҽ�Ҫ������Ҫ����Ķ����ṩһ��ʲô�ӿ�
 * interfaces - the list of interfaces for the proxy class to implement 
 * 
 * һ��InvocationHandler���󣬱�ʾ���ǵ��������̬��������ڵ��÷�����ʱ�򣬻��������һ��InvocationHandler������
 * h - the invocation handler to dispatch method invocations to  
 */