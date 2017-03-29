package aop.dynamicproxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {
	
	/** ��Ҫ�����Ŀ���� */
	private Object target;
	
	/**
	 * д���̶���aopר��:��ί�ж��󲢷���һ��������
	 * @param target
	 * @return
	 */
	public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
        // ����֮ǰִ��
        System.out.println("����֮ǰִ��");
        // ִ��ҵ��
        result = method.invoke(target, args);
        // ����֮��ִ��
        System.out.println("����֮��ִ��");
        return result;
	}

}
