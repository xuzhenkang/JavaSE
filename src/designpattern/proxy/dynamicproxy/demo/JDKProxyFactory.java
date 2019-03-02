package designpattern.proxy.dynamicproxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyFactory implements InvocationHandler {
	private Object targetObject;

	public Object createProxyInstance(Object targetObject) {
		this.targetObject = targetObject;

		// newProxyInstance方法的参数解释：
		// 第一个参数：要代理的目标对象的类装载器
		// 第二个参数：目标对象所实现的所有接口
		// 第三个参数：一个回调的接口，一旦生成这个代理对象后，就会回调这个接口当中的invoke方法。
		// 可以让JDKProxyFactory实现InvocationHandler接口，然后完成里面的invoke方法。
		// 每一次生成这个代理对象的时候，就会调用这个invoke方法。
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
