package designpattern.proxy.dynamicproxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CGLibProxyFactory implements MethodInterceptor {
	private Object targetObject;
	// 如果类没有实现接口的时候，就要采用CGLib的方式来创建代理对象。如果类实现了接口，则采用jdk提供的Proxy代理来生成代理对象
	public Object createProxyInstance(Object targetObject) {
		this.targetObject = targetObject;
		Enhancer enhancer = new Enhancer();
		
		// 设置目标类为代理对象的父类 。此时，代理技术会产生一个目标类的子类，这个子类会覆盖目标类里面所有非final修饰的方法，覆盖的代码里面会有一些自身的代码。
		enhancer.setSuperclass(this.targetObject.getClass());
		
		// 设置回调,当代理对象的业务方法被调用的时候，
		// 会回调MethodInterceptor的intercept方法
		enhancer.setCallback(this);
		return enhancer.create(); // 返回创建的代理对象
	}
	/**
	 * 第一个参数是代理对象本身，第二个是被拦截到的方法，第三个是方法的输入参数，第四个是方法的代理对象
	 */
	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy arg3) throws Throwable { // 环绕通知
		
		PersonServiceBean bean = (PersonServiceBean) this.targetObject;
		Object result = null;
		if (bean.getUser() != null) {
			// 若在此处执行advice()方法，则advice()方法称为：前置通知
			try {
				result = method.invoke(targetObject, args);// 根据这个方法来判断通知的类型，若在此方法前执行的方法，则称为前置通知，在后面称为后置通知，若在捕获到该方法的例外时执行的方法，称为例外通知，finally里面的是最终通知。
				// 若在此处执行afteradvice()方法，则afteradvice()方法称为：后置通知
			} catch (RuntimeException e) {
				// 若在此处执行exceptionadvice()方法，则exceptionadvice()方法称为：例外通知
			} finally {
				// 若在此处执行finallyadvice()方法，则finallyadvice()方法称为：最终通知
			}
		}
		// 所谓通知就是在我们拦截到执行方法的时候要做的事情，就是通知。
		return result;
	}
}

// 切面是对横切性关注点的抽象，而类是对物体特征的抽象。
// 横切性关注点是：对哪些方法实现拦截，拦截后要做的事情，这种思考的步骤就是横切性关注点。
// 连接点：被拦截到的点，就是连接点，在spring中，连接点只是针对方法来说的。根本意义上的连接点还可以是：属性或构造器
// 切入点：就是对哪些连接点进行拦截的定义（对于此应用而言，切入点就是：拦截所有的业务方法，拦截到的每一个方法就是连接点）
// 通知：拦截到方法后要做的事情
// 目标对象：代理的目标
// 代理对象：通过enhancer.create创建出来的对象就是代理对象
// 织入：将切面应用到目标对象并导致代理对象创建的过程
// 引入：不修改类代码的情况下，在运行期为类的代理对象动态地添加一些方法或属性
