package javase.thread.volatile_keyword;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <h4>����AtomicInteger�ķ�ʽ</h4>
 * <p>
 * ��java 1.5��java.util.concurrent.atomic�����ṩ��һЩԭ�Ӳ����࣬���Ի����������͵�
 * ��������1���������Լ�����1���������Լ��ӷ���������һ��������������������һ�����������˷�װ����֤��Щ������ԭ���Բ�����atomic������CAS��ʵ��ԭ���Բ����ģ�Compare
 * And Swap����CASʵ���������ô������ṩ��CMPXCHGָ��ʵ�ֵģ���������ִ��CMPXCHGָ����һ��ԭ���Բ�����
 * </p>
 * 
 * @author Kang
 *
 */
public class Demo4_VolatileSolution3 {
	public AtomicInteger inc = new AtomicInteger();

	/**
	 * volatile�ؼ����ܱ�֤�ɼ���û�д���������ĳ������û�ܱ�֤ԭ���ԡ��ɼ���ֻ�ܱ�֤ÿ�ζ�ȡ�������µ�ֵ������volatileû�취��֤�Ա����Ĳ�����ԭ���ԡ�
	 */
	public void increase() {
		this.inc.getAndIncrement();// ���Ǿ���ԭ���Ե���������
	}

	AtomicInteger a;

	public static void main(String[] args) {

		final Demo4_VolatileSolution3 t = new Demo4_VolatileSolution3();

		for (int i = 0; i < 100; i++) {
			new Thread() {

				@Override
				public void run() {
					for (int j = 0; j < 1000; j++) {
						t.increase();
					}
				}

			}.start();
		}

		while (Thread.activeCount() > 1) { // ��֤ǰ����̶߳�ִ����
			Thread.yield();
		}
		System.out.println(t.getInc());
	}

	public AtomicInteger getInc() {
		return inc;
	}

}
