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
 * Proxy.newProxyInstance的参数解释：
 * 
 * 一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载
 * loader - the class loader to define the proxy class  
 * 
 * 一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口
 * interfaces - the list of interfaces for the proxy class to implement 
 * 
 * 一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上
 * h - the invocation handler to dispatch method invocations to  
 */