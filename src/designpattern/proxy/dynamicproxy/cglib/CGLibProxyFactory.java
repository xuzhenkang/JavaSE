package designpattern.proxy.dynamicproxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CGLibProxyFactory implements MethodInterceptor {
	private Object targetObject;
	// �����û��ʵ�ֽӿڵ�ʱ�򣬾�Ҫ����CGLib�ķ�ʽ������������������ʵ���˽ӿڣ������jdk�ṩ��Proxy���������ɴ������
	public Object createProxyInstance(Object targetObject) {
		this.targetObject = targetObject;
		Enhancer enhancer = new Enhancer();
		
		// ����Ŀ����Ϊ�������ĸ��� ����ʱ�������������һ��Ŀ��������࣬�������Ḳ��Ŀ�����������з�final���εķ��������ǵĴ����������һЩ����Ĵ��롣
		enhancer.setSuperclass(this.targetObject.getClass());
		
		// ���ûص�,����������ҵ�񷽷������õ�ʱ��
		// ��ص�MethodInterceptor��intercept����
		enhancer.setCallback(this);
		return enhancer.create(); // ���ش����Ĵ������
	}
	/**
	 * ��һ�������Ǵ���������ڶ����Ǳ����ص��ķ������������Ƿ�����������������ĸ��Ƿ����Ĵ������
	 */
	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy arg3) throws Throwable { // ����֪ͨ
		
		PersonServiceBean bean = (PersonServiceBean) this.targetObject;
		Object result = null;
		if (bean.getUser() != null) {
			// ���ڴ˴�ִ��advice()��������advice()������Ϊ��ǰ��֪ͨ
			try {
				result = method.invoke(targetObject, args);// ��������������ж�֪ͨ�����ͣ����ڴ˷���ǰִ�еķ��������Ϊǰ��֪ͨ���ں����Ϊ����֪ͨ�����ڲ��񵽸÷���������ʱִ�еķ�������Ϊ����֪ͨ��finally�����������֪ͨ��
				// ���ڴ˴�ִ��afteradvice()��������afteradvice()������Ϊ������֪ͨ
			} catch (RuntimeException e) {
				// ���ڴ˴�ִ��exceptionadvice()��������exceptionadvice()������Ϊ������֪ͨ
			} finally {
				// ���ڴ˴�ִ��finallyadvice()��������finallyadvice()������Ϊ������֪ͨ
			}
		}
		// ��ν֪ͨ�������������ص�ִ�з�����ʱ��Ҫ�������飬����֪ͨ��
		return result;
	}
}

// �����ǶԺ����Թ�ע��ĳ��󣬶����Ƕ����������ĳ���
// �����Թ�ע���ǣ�����Щ����ʵ�����أ����غ�Ҫ�������飬����˼���Ĳ�����Ǻ����Թ�ע�㡣
// ���ӵ㣺�����ص��ĵ㣬�������ӵ㣬��spring�У����ӵ�ֻ����Է�����˵�ġ����������ϵ����ӵ㻹�����ǣ����Ի�����
// ����㣺���Ƕ���Щ���ӵ�������صĶ��壨���ڴ�Ӧ�ö��ԣ��������ǣ��������е�ҵ�񷽷������ص���ÿһ�������������ӵ㣩
// ֪ͨ�����ص�������Ҫ��������
// Ŀ����󣺴����Ŀ��
// �������ͨ��enhancer.create���������Ķ�����Ǵ������
// ֯�룺������Ӧ�õ�Ŀ����󲢵��´�����󴴽��Ĺ���
// ���룺���޸�����������£���������Ϊ��Ĵ������̬�����һЩ����������
