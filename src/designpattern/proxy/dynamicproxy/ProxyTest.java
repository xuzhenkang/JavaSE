package designpattern.proxy.dynamicproxy;

import org.junit.Test;

public class ProxyTest {
	@Test
	public void testProxy() {
		Sourceable newProxy = (Sourceable) new MyProxy(new SourceBean()).newProxy();
		
		newProxy.method();
	}
}
/**
	动态代理与静态代理的区别在于：
	静态代理：由程序员创建或工具生成代理类的源码，再编译代理类。所谓静态也就是在程序运行前就已经存在代理类的字节码文件，代理类和委托类的关系在运行前就确定了。 
	动态代理：动态代理模式的结构跟上面的静态代理模式稍微有所不同，多引入了一个InvocationHandler角色。
			先解释一下InvocationHandler的作用：
			在静态代理中，代理Proxy中的方法，都指定了调用了特定的realSubject中的对应的方法：
			在上面的静态代理模式下，Proxy所做的事情，无非是调用在不同的request时，调用触发realSubject对应的方法；更抽象点看，Proxy所作的事情；
			在Java中 方法（Method）也是作为一个对象来看待了，动态代理工作的基本模式就是将自己的方法功能的实现交给 InvocationHandler角色，
			外界对Proxy角色中的每一个方法的调用，Proxy角色都会交给InvocationHandler来处理，而InvocationHandler则调用具体对象角色的方法。
	
	动态代理实现步骤 
		具体步骤是： 
		a. 实现InvocationHandler接口创建自己的调用处理器 
		b. 给Proxy类提供ClassLoader和代理接口类型数组创建动态代理类 
		c. 以调用处理器类型为参数，利用反射机制得到动态代理类的构造函数 
		d. 以调用处理器对象为参数，利用动态代理类的构造函数创建动态代理类对象 
	
	使用Java动态代理机制的好处：
		1、减少编程的工作量：假如需要实现多种代理处理逻辑，只要写多个代理处理器就可以了，无需每种方式都写一个代理类。 
		2、系统扩展性和维护性增强，程序修改起来也方便多了(一般只要改代理处理器类就行了)。

	缺点：
		代理类和委托类需要都实现同一个接口。也就是说只有实现了某个接口的类可以使用Java动态代理机制。
		但是，事实上使用中并不是遇到的所有类都会给你实现一个接口。因此，对于没有实现接口的类，目前无法使用该机制。 那怎么办呢？
		幸好我们有cglib。“CGLIB（Code Generation Library），是一个强大的，高性能，高质量的Code生成类库，它可以在运行期扩展Java类与实现Java接口。”待整理。
	
	代理使用场景：
	我理解的两个作用：
	1.方法增强，让你可以在不修改源码的情况下，增强一些方法，比如添加日志等。
	2.以用作远程调用，好多rpc框架就是用代理方式实现的。
	
	总结：
	代理这块与反射有关系，调用了其中的方法，动态代理除了jdk的接口实现方式外还有cglib，以及相关的springAOP。还有RPC框架也是代理实现的。
	从设计模式角度去看，还有跟装饰模式有区别。最近梳理知识点，越来越发现好多东西都是相关的。
	
	注：本文也是学习笔记，没有从源码角度看下动态代理核心接口的实现。先理解其中的角色及关键步骤。
 */