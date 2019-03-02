package jvm.gc;

import java.lang.ref.WeakReference;

// 引用的分类：强、软、弱、虚
// 强引用不能被gc回收
// 弱引用调用gc就会被gc回收
public class RefDemo {
	public static void main(String[] args) {
		String str = new String("kangkang");// 该对象位于堆空间
		WeakReference<String> wrf = new WeakReference<String>(str);
		System.out.println("gc运行前" + wrf.get());
		str = null; // 断开引用
		System.gc(); // 通知回收
		System.runFinalization();
		System.out.println("gc运行后" + wrf.get()); // 运行发现：对象仍然存在， 不能回收
	}
	@SuppressWarnings("unused")
	private void testStrongRef() {
		String str = "kangkang";// 字符串位于常量池，共享（不能回收），它是强引用
		WeakReference<String> wrf = new WeakReference<String>(str);
		System.out.println("gc运行前" + wrf.get());
		str = null; // 断开引用
		System.gc(); // 通知回收
		System.runFinalization();
		System.out.println("gc运行后" + wrf.get()); // 运行发现：对象仍然存在， 不能回收
	}
}

/**
 * 强引用（StringReference）：引用指向对象，GC运行时不回收
 * 软引用（SoftReference）：GC运行时可能回收（JVM内存不足时）
 * 弱引用（WeakReference）：GC运行时立即回收
 * 虚引用（PhantomReference）：类似于无引用，主要跟踪对象被回收的状态，不能单独使用，必须与引用队列（ReferenceQueue）联合使用。
 */

