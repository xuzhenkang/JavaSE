package designpattern.singleton;


/**
 * 双重检测锁单例模式（DCL, Double Checked Locking Singleton）
 * 注意：该模式存在问题，某些情况下无法使用。
 * 原因：由于指令重排序。 初始化一个对象并使一个引用指向它，这个过程不是原子的。
 *     导致了可能会出现引用指向了对象并未初始化好的那块内存，使用volatile修饰对象引用，防止重排序即可解决。
 *     sc = new SingletonDCL();
 *     这个操作不是原子的，从而留给了JVM重排序的机会。JVM的重排序也是有原则的，在单线程中，不管怎么排，保证最终结果一致。
 *     多线程的情况下指令重排序就会给程序员带来问题。上面这个操作可以拆解成：
 *       1. 栈内存开辟空间准备初始化对象；
 *       2. 堆内存开辟空间准备初始化对象；
 *       3. 初始化对象；
 *       4. 栈中引用指向这个堆内存空间地址。
 *     指令重排序后，可能会是1、2、4、3；这样重排序之后，对单个线程来说效果是一样的，所以JVM认为是合法的重排序，但是在多线程环境下就会出现问题。
 *     这里到4的时候sc已经指向了一块堆内存（!=null），只是这块堆内存还没初始化就返回了，使用的时候抛NullPointException。
 *     当然这里的几个步骤并不算真正的指令，指令的力度只会比这个还小，但是可以说明问题。
 *     加入volatile关键字之后，查看汇编代码可以发现多了一句 lock addl $0x0,(%esp) 相当于一个内存屏障。
 *     volatile关键字作用：
 *       1. 保证内存可见性
 *          原理：使用该变量必须重新去主内存读取，修改该变量的话必须立即刷新主内存。
 *       2. 防止指令重排序
 *          原理：通过存入内存屏障
 *       3. 不能保证操作的原子性（注意）
 *     
 * @author lenovo
 *
 */
public class SingletonDCL {
	private static /*volatile*/ SingletonDCL instance = null;
	
	private SingletonDCL() {}
	
	public static SingletonDCL getInstance() {
		if (instance == null) {
			SingletonDCL sc;
			synchronized (SingletonDCL.class) {
				sc = instance;
				if (sc == null) {
					synchronized (SingletonDCL.class) {
						if (sc == null) {
							sc = new SingletonDCL();
						}
					}
					instance = sc;
				}
			}
		}
		return instance;
	}
}



